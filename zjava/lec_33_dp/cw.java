package zjava.lec_33_dp;

public class cw {

    public static int minCostRecursion(int[][] cost,int i,int j){
        int m = cost.length; 
        int n = cost[0].length;
        if(i == m-1 && j == n-1){
            return cost[i][j];
        }
        if(i>=m || j>=n) return Integer.MAX_VALUE;

        

        int ans1 = minCostRecursion(cost, i+1, j);
        int ans2 = minCostRecursion(cost, i, j+1);
        int ans3 = minCostRecursion(cost, i+1, j+1);
        return cost[i][j] + Math.min(ans1,Math.min(ans2,ans3));
    }

    public static int minCostRecursionDPMEMO(int[][] cost,int i,int j,int[][] dp){
        int m = cost.length;
        int n = cost[0].length;

        if(i == m-1 && j == n-1){
            return cost[i][j];
        }
        if(i>=m || j>=n) return Integer.MAX_VALUE;

        if(dp[i][j] != Integer.MIN_VALUE){
            return dp[i][j];
        }
        int ans1 = minCostRecursionDPMEMO(cost, i+1, j,dp);
        int ans2 = minCostRecursionDPMEMO(cost, i, j+1,dp);
        int ans3 = minCostRecursionDPMEMO(cost, i+1, j+1,dp);
        

        dp[i][j] = cost[i][j] + Math.min(ans1,Math.min(ans2, ans3));
        return dp[i][j];
    }

    public static int minCostRecursionDPTABULATION(int[][] cost){
        int m = cost.length,n=cost[0].length;
        int[][] dp = new int[m+1][n+1];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i == m-1 && j == n-1){
                    dp[i][j] = cost[i][j];
                    continue;
                }
                int ans1 = dp[i+1][j];
                int ans2 = dp[i][j+1];
                int ans3 = dp[i+1][j+1];
                dp[i][j] = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
            }
        }
        return dp[0][0];
    }


    public static void main(String[] args){
        int[][] cost = {{1,5,11},{8,13,12},{2,3,7},{15,16,18}};
        System.out.println("\n" + minCostRecursion(cost,0,0));
        int[][] dp = new int[cost.length+1][cost[0].length+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = Integer.MIN_VALUE;
            }
        }
        System.out.println(minCostRecursionDPMEMO(cost,0,0,dp));

        int m = cost.length,n=cost[0].length;
        int[][] newdp = new int[m+1][n+1];

        for(int i=0;i<newdp.length;i++){
            for(int j=0;j<newdp[0].length;j++){
                newdp[i][j] = Integer.MAX_VALUE;
            }
        }

        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i == m-1 && j == n-1){
                    newdp[i][j] = cost[i][j];
                    continue;
                }
                int ans1 = newdp[i+1][j];
                int ans2 = newdp[i][j+1];
                int ans3 = newdp[i+1][j+1];
                newdp[i][j] = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
            }
        }
        System.out.println(newdp[0][0]);
    }
}
