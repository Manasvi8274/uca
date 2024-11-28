package zjava.lec_32_dp;

import java.util.Scanner;

public class basic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] dp = new int[n+1];
        dp[0] = 0;

        for (int i=1;i<=n;i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j = 1;j<=Math.sqrt(i);j++){
                dp[i] = Math.min(dp[i] ,1 + dp[i-j*j]);
            }
        }
        System.out.println(dp[n]);
    }
}


// public class basic{
//     public static int recursive_minstepstoone(int x ){
//         if(x == 0)  return 0;
//         if(x == 1)  return 1;

//         int a1 = recursive_minstepstoone(x-1);
//         int a2 = x%2 == 0 ? recursive_minstepstoone(x/2): Integer.MAX_VALUE;
//         int a3 = x%3 == 0 ? recursive_minstepstoone(x/3): Integer.MAX_VALUE;

//         return 1+ Math.min(a1,Math.min(a2,a3));
//     }

//     public static int iterative_minstepstoone_dp(int n){
//         if(n == 1)  return 0;
//         int[] dp = new int[n+1];
//         dp[1] = 0;
//         for(int i=2;i<=n;i++){
//             int subone = Integer.MAX_VALUE;
//             int divtwo = Integer.MAX_VALUE;
//             int divthree = Integer.MAX_VALUE;
//             subone = dp[i-1];
//             if(i%2 == 0){
//                 divtwo = dp[i/2];
//             }
//             if(i%3 == 0){
//                 divthree = dp[i/3];
//             }
//             dp[i] = Math.min(subone , Math.min(divthree, divtwo)) + 1;
//         }
//         return dp[n];

//     }
    
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int[] dp = new int[x+1];
//         for(int i=0;i<x+1;i++){
//             dp[i] = -1;
//         }
//         System.out.println(recursive_minstepstoone(x));
//     }

    // public static int staircase(int x){
    //     int[] dp = new int[x+1];
    //     dp[0]=1;
    //     dp[1]=1;
    //     dp[2]=2;
    //     dp[3]=4;
    //     for(int i=4;i<=x;i++){
    //         dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
    //     }
    //     return dp[x];

    // }

    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     int n = sc.nextInt();
    //     System.out.println(staircase(n));
    // }
// }


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
