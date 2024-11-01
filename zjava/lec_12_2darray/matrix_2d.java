package lec_12_2darray;
import java.util.Scanner;

public class matrix_2d {
    // public static int[] row_wise_sum(int[][] arr){
    //     int[] arrsum = new int[arr[0].length];
    //     for(int i=0;i<arr.length;i++){
    //         int s=0;
    //         for(int j=0;j<arr[i].length;j++){
    //             s+=arr[i][j];
    //         }
    //         arrsum[i] = s;
    //     }
    //     return arrsum;
    // }

    public static String largest_row_col(int[][] arr) {
        int[] rowwise = new int[arr.length];
        int[] colwise = new int[arr[0].length];


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                rowwise[i]+=arr[i][j];
                colwise[j]+=arr[i][j]; 
            }
        }
        int r=0;
        boolean flagrow=false;
        int max=0;
        for(int i=0;i<rowwise.length;i++){
            if(max<rowwise[i]){
                r=i;
                max = rowwise[i];
                flagrow=true;
            }
        }
        for(int i=0;i<colwise.length;i++){
            if(max<colwise[i]){
                r=-i;
                max = colwise[i];
                flagrow=false;
            }
        }
        if(flagrow){
            return "row " + Integer.toString(r) + " " + Integer.toString(max);
        }
        else{
            return "col " + Integer.toString(-r) + " " + Integer.toString(max);
        }
    }

    public static void wave(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        for(int i=0;i<row;i++){
                if(i%2 == 0){
                    for(int j=0;j<col;j++){
                        System.out.print(arr[j][i]+" ");
                    }
                }
                else{
                    for(int j= col-1;j>=0;j--){
                    System.out.print(arr[j][i]+" ");
                    }
                }
        }
    }

    public static void spiral(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        int left = 0;
        int right = col-1;
        int bottom = row-1;

        while(left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(arr[left][i] +" ");
            }
            for(int i=left+1;i<=bottom;i++){
                System.out.print(arr[i][right] +" ");
            }
            right--;

            for(int i = right;i>=left;i--){
                System.out.print(arr[bottom][i] +" ");
            }
            bottom--;

            for(int i=bottom;i>left;i--){
                System.out.print(arr[i][left] +" ");
            }
            left++;
        }
    }

    public static int sum_boundary_diagonal(int[][] arr){
        int n = arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j && i!=0 && i!=n-1 && j!=0 && j!=n-1){
                    ans+=arr[i][j];
                }
                if(i+j==n-1 && i!=0 && i!=n-1 && j!=0 && j!=n-1 && i!=j){
                    ans+=arr[i][j];
                }
                if(i == 0 || i== n-1){
                    ans+=arr[i][j];
                }
                if((j == 0 || j == n-1) && (i!=0 && i!=n-1)){
                    ans+=arr[i][j];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int t = sc.nextInt();
                arr[i][j] = t;
            }
        }

        // int[] ans = row_wise_sum(arr);
        // for(int i=0;i<ans.length;i++){
        //     System.out.print(ans[i]+"\t");
        // }
        // String ans = largest_row_col(arr);
        // System.out.println(ans);
        // wave(arr);
        // spiral(arr);
        System.out.println(sum_boundary_diagonal(arr));
    }
}
