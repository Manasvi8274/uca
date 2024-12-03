package zjava.lec_33_dp;

import java.util.Scanner;

public class cw {

    // public static int minCostRecursion(int[][] cost,int i,int j){
    //     int m = cost.length; 
    //     int n = cost[0].length;
    //     if(i == m-1 && j == n-1){
    //         return cost[i][j];
    //     }
    //     if(i>=m || j>=n) return Integer.MAX_VALUE;

        

    //     int ans1 = minCostRecursion(cost, i+1, j);
    //     int ans2 = minCostRecursion(cost, i, j+1);
    //     int ans3 = minCostRecursion(cost, i+1, j+1);
    //     return cost[i][j] + Math.min(ans1,Math.min(ans2,ans3));
    // }

    // public static int minCostRecursionDPMEMO(int[][] cost,int i,int j,int[][] dp){
    //     int m = cost.length;
    //     int n = cost[0].length;

    //     if(i == m-1 && j == n-1){
    //         return cost[i][j];
    //     }
    //     if(i>=m || j>=n) return Integer.MAX_VALUE;

    //     if(dp[i][j] != Integer.MIN_VALUE){
    //         return dp[i][j];
    //     }
    //     int ans1 = minCostRecursionDPMEMO(cost, i+1, j,dp);
    //     int ans2 = minCostRecursionDPMEMO(cost, i, j+1,dp);
    //     int ans3 = minCostRecursionDPMEMO(cost, i+1, j+1,dp);
        

    //     dp[i][j] = cost[i][j] + Math.min(ans1,Math.min(ans2, ans3));
    //     return dp[i][j];
    // }

    // public static int minCostRecursionDPTABULATION(int[][] cost){
    //     int m = cost.length,n=cost[0].length;
    //     int[][] dp = new int[m+1][n+1];

    //     for(int i=0;i<dp.length;i++){
    //         for(int j=0;j<dp[0].length;j++){
    //             dp[i][j] = Integer.MAX_VALUE;
    //         }
    //     }

    //     for(int i=m-1;i>=0;i--){
    //         for(int j=n-1;j>=0;j--){
    //             if(i == m-1 && j == n-1){
    //                 dp[i][j] = cost[i][j];
    //                 continue;
    //             }
    //             int ans1 = dp[i+1][j];
    //             int ans2 = dp[i][j+1];
    //             int ans3 = dp[i+1][j+1];
    //             dp[i][j] = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
    //         }
    //     }
    //     return dp[0][0];
    // }

    // public static void main(String[] args){
    //     int[][] cost = {{1,5,11},{8,13,12},{2,3,7},{15,16,18}};
    //     System.out.println("\n" + "SIMPLE RECURSION = " + minCostRecursion(cost,0,0));

    //     //MEMORIZATION
    //     int[][] dp = new int[cost.length+1][cost[0].length+1];
    //     for(int i=0;i<dp.length;i++){
    //         for(int j=0;j<dp[0].length;j++){
    //             dp[i][j] = Integer.MIN_VALUE;
    //         }
    //     }
    //     System.out.println("MEMORIZATION = "+minCostRecursionDPMEMO(cost,0,0,dp));

    //     //bottom top ans will be dp[0][0]
    //     int m = cost.length,n=cost[0].length;
    //     int[][] newdp = new int[m+1][n+1];

    //     for(int i=0;i<newdp.length;i++){
    //         for(int j=0;j<newdp[0].length;j++){
    //             newdp[i][j] = Integer.MAX_VALUE;
    //         }
    //     }

    //     for(int i=m-1;i>=0;i--){
    //         for(int j=n-1;j>=0;j--){
    //             if(i == m-1 && j == n-1){
    //                 newdp[i][j] = cost[i][j];
    //                 continue;
    //             }
    //             int ans1 = newdp[i+1][j];
    //             int ans2 = newdp[i][j+1];
    //             int ans3 = newdp[i+1][j+1];
    //             newdp[i][j] = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
    //         }
    //     }
    //     System.out.println("bottom top ans will be newdp[0][0] = " + newdp[0][0]);

    //     //top bottom ans will be dp[m1-1][n1-1]
    //     int m1 = cost.length,n1=cost[0].length;
    //     int[][] newnewdp = new int[m1][n1];

    //     for(int i=0;i<newnewdp.length;i++){
    //         for(int j=0;j<newnewdp[0].length;j++){
    //             newnewdp[i][j] = Integer.MAX_VALUE;
    //         }
    //     }

    //     for(int i=0;i<m1;i++){
    //         for(int j=0;j<n1;j++){
    //             // System.out.println("i = "+i+" j = "+j);
    //             if(i == 0 && j == 0){
    //                 newnewdp[i][j] = cost[i][j];
    //                 continue;
    //             }
    //             int ans1 = Integer.MAX_VALUE;
    //             int ans2 = Integer.MAX_VALUE;
    //             int ans3 = Integer.MAX_VALUE;
    //             if(i-1>=0){
    //                 ans1 = newnewdp[i-1][j];
    //             }
                
    //             if(j-1>=0){
    //                 ans2 = newnewdp[i][j-1];
    //             }

    //             if(j-1>=0 && i-1>=0){
    //                 ans3 = newnewdp[i-1][j-1];
    //             }
    //             newnewdp[i][j] = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
    //         }
    //     }
    //     System.out.println("top bottom ans will be newnewdp[m1-1][n1-1] = "+newnewdp[m1-1][n1-1]);
    // }
    public static int longestcommonsubsequence(String s1,String s2,int i,int j){
        if(i>=s1.length()  || j>=s2.length())   return 0;
        if(s1.charAt(i) == s2.charAt(j)){
            return longestcommonsubsequence(s1, s2,i+1,j+1) + 1;
        }
        return Math.max(longestcommonsubsequence(s1, s2, i+1, j) , longestcommonsubsequence(s1, s2, i, j+1));

    }

    public static int longestcommonsubsequenceMemo(String s1,String s2,int i,int j,int[] dp){

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(longestcommonsubsequence(s1, s2, 0, 0));
        int[][] dp = new int[2][s1.length()>s2.length()?s2.length():s1.length()];
        
        
    }
}
