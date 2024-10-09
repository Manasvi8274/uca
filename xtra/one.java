// package xtra.one_q;
import java.util.Scanner;

class one{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int s;
            s=sc.nextInt();
            arr[i] = s;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +"\t");
        }
        System.out.println();
        //sol
        for(int i = 0;i < n;i++){
            if (arr[i] >=n) arr[i] += (arr[arr[i]]) * n;
            else    arr[i] += (arr[arr[i]] % n) * n;
        }
        for(int i=0;i<n;i++){
            arr[i] = arr[i] / n;
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +"\t");
        }
    }
}