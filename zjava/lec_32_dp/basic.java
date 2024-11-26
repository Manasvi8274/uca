package zjava.lec_32_dp;

import java.util.Scanner;

public class basic{

    public static int staircase(int x){
        int[] dp = new int[x+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for(int i=4;i<=x;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[x];

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(staircase(n));
    }
}


// public class basic {

//     public static int fiboiter(int x){
//         int dp[] = new int[x+1];
//         dp[0] = 0;
//         dp[1] = 1;
//         for(int i=2;i<=x;i++){
//             dp[i] = dp[i-1] + dp[i-2];
//         }
//         return dp[x];
//     }

//     public static int fiborec(int x,int[] dp){
//         if(x == 1 || x == 0)    return x;
//         // if(x<0) return 0;
//         if(dp[x-1] == 0){
//             dp[x-1] = fiborec(x-1, dp);
//         }

//         if(dp[x-2] == 0){
//             dp[x-2] = fiborec(x-2, dp);
//         }

//         return dp[x-1] + dp[x-2];
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int dp[] = new int[x+1];
//         System.out.println(fiborec(x , dp));

//         System.out.println(fiboiter(x));
//     }
    
// }
