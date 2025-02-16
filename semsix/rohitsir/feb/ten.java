package semsix.rohitsir.feb;

public class ten{
    // public static long fib(long n , long[] dp){
    //     if (n==0L || n == 1L){
    //         return n;
    //     }
    //     if(dp[n]!=0L)   return dp[n];
    //     return dp[n] = fib(n-1L,dp) + fib(n-2L,dp);
    // }

    public static Long fib(long n){
        // Map<Long , Long> mp = new HashMap<>();

        // mp.put(0L,0L);
        // mp.put(1L,1L);
        if(n == 0L || n==1L)    return n;

        long prev=0;
        long prev2=1;
        long ans=0;
        for(long i=2L;i<=n;i++){
            ans = prev+prev2;
            prev=prev2;
            prev2=ans;
        }
        return prev2;
    }

    public static void main(String[] args) {
        long n=100;
        
        long startTime = System.nanoTime();
        System.out.println("\n"+fib(n));
        long endTime = System.nanoTime();
        System.out.println(((endTime - startTime) / 1000000)  + "ms");
    }
}