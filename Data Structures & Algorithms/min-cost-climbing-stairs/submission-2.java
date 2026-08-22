class Solution {
    public int minCostUtil(int i,int cost[], int dp[]){
        if(i >= cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int oneStep = minCostUtil(i+1, cost,dp);
        int twoStep = minCostUtil(i+2,cost,dp);
        return dp[i]=  cost[i] + Math.min(oneStep, twoStep);
    }
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(
            minCostUtil(0,cost,dp), minCostUtil(1,cost,dp)

        );
    }
}
