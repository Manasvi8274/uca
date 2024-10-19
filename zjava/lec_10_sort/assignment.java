import java.util.Scanner;

public class assignment {

    public static void push_zeroes(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]==0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +"\t");
        }
    }

    public static void rotateLeft(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for(int i=0;i<(arr.length-k)/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-k-1-i];
            arr[arr.length-k-1 -i] = temp;
        }
        int c=0;
        for(int i=arr.length-k;i<arr.length-k/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - c];
            arr[arr.length -1 - c] = temp;
            c++;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +"\t");
        }
    }
    public static void rotateRight(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<nums.length/2;i++){
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        for(int i=0;i<(k)/2;i++){
            int temp = nums[i];
            nums[i] = nums[k-1-i];
            nums[k-1 -i] = temp;
        }
        int c=0;
        for(int i=k;i<=k+k/2;i++){
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - c];
            nums[nums.length -1 - c] = temp;
            c++;
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] +"\t");
        }
    }

    public static void secondlargest(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        if(nums.length == 0){
            System.out.println(Integer.MIN_VALUE);
            return;
        }
        int l=nums[0],sl=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>l){
                sl=l;
                l=nums[i];
            }
            else if(sl<nums[i] && nums[i] < l){
                sl=nums[i];
            }
        }
        System.out.println(sl);
    }

    public static void checkrotate() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
        return;
    }

    //////////////////////////////////////////////wrong by over swap
    // public static void sort_zero_one_two(){
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();
    //     int[] nums = new int[n];

    //     for(int i = 0;i<n;i++){
    //         nums[i] = sc.nextInt();
    //     }

    //     int z=0,t=nums.length-1,i=0;
    //     while(i<nums.length){
    //         if(nums[i]==0){
    //             // int temp = nums[i];
    //             nums[i] = nums[z];
    //             nums[z] = 0;
    //             z++;
    //             i--;
    //         }
    //         if(nums[i] == 2){
    //             // int temp = nums[i];
    //             nums[i] = nums[t];
    //             nums[t] = 2;
    //             t--;
    //             i--;
    //         }
    //         i++;
    //     }

    //     for(i=0;i<nums.length;i++){
    //         System.out.print(nums[i] +"\t");
    //     }

    // }

    public static void main(String[] args) {
        // push_zeroes();
        // rotateLeft();
        // rotateRight();
        // secondlargest();
        // checkrotate();
    }
}
