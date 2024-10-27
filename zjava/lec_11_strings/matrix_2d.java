import java.util.Scanner;

public class matrix_2d {
    public static int[] row_wise_sum(int [][] arr){
        int[] arrsum = new int[arr[0].length];
        for(int i=0;i<arr.length;i++){
            int s=0;
            for(int j=0;j<arr[i].length;j++){
                s+=arr[i][j];
            }
            arrsum[i] = s;
        }
        return arrsum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[] ans = row_wise_sum(arr);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+"\t");
        }
    }
}
