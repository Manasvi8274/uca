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

    public static void rotate(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        k--;
        int end = arr.length-1;
        while(k>=0){
            int temp = arr[k];
            arr[k] = arr[end];
            arr[end] = temp;
            end--;
            k--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +"\t");
        }
    }

    public static void main(String[] args) {
        // push_zeroes();
        rotate();
    }
}
