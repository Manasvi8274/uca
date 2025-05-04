package semsix.rohitsir.march;

import java.util.*;

// DO MAJORITY ELEMENT LEETCODE BOYEMORE ALGO

public class three{
    class BoyerMooreCounting {

        int count[];
        Integer suspectedCandidates[];
        int n;

        BoyerMooreCounting(int n) {
            count = new int[n];
            suspectedCandidates = new Integer[n];
            this.n = n;
        }


        // c1 = 1 ,votes = 1 , c2 = 1 votes = 2
        // 
        void addElement(int num) {
            for (int i = 0; i < n; i++) {
                if (suspectedCandidates[i] != null && suspectedCandidates[i] == num) {
                    count[i]++;
                    return;
                }
            }

            for (int i = 0; i < n; i++) {
                if (count[i] == 0) {
                    suspectedCandidates[i] = num;
                    count[i] = 1;
                    return;
                }
            }

            // Element is not found in any suspected Candidates.
            // Reduce the count for All.

            for(int i = 0; i < n; i++) {
                count[i]--;

                if (count[i] == 0) {
                    suspectedCandidates[i] = null;
                }
            }
        }
    }

    List<Integer> getMajorityElements(int nums[], int k) {
        BoyerMooreCounting bmc = new BoyerMooreCounting(k);
        List<Integer> ans = new ArrayList<>();
        for(int num: nums) {
            bmc.addElement(num);
        }


        // 1 2
        // 6 4
        int freshCount[] = new int[k];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < k; j++) {
                if (bmc.suspectedCandidates[j] != null && bmc.suspectedCandidates[j] == nums[i]) {
                    freshCount[j]++;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            if (freshCount[i] > nums.length / k) {
                ans.add(bmc.suspectedCandidates[i]);
            }
        }

        //System.out.println()

        return ans;
    }

    public static int majority(int[] nums){
        Integer c1 = null,c2= null;
        int votes1 = 0, votes2 = 0;
        
        for(int i:nums){
            if(c1 == null){
                c1=i;
                votes1=1;
            }
            else if(c1 == i){
                votes1++;
            }
            else if(c2 == null){
                c2 = i;
            }
            else if(c2 == i){
                votes2++;
            }
        }
        if(votes1 > votes2){
            return c1;
        }
        return c2;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // for n//2 element
        
    }
}

// BOYEMORE ALGO
// STREAM of data with counting data
// eg for n/2 count in a arr what do we do -:
//  we take a candidte element but here we take 2 
//  like 1 - 6(count) , 2 - 4(count)

//////////////////////////////////// COMPLEXITY - TIME=N*K , SPACE-O(K)

// STEPS 
// 1. Counting a majority element in stream/ array
// 2. Know how many suspected Candidates can be
// 3. Maintain the count for suspected candidates.
// 4. Reduce the count if it doesnt match with any suspected candidate.
// 5. Make a fresh Count array for suspected elements and find the majority ones