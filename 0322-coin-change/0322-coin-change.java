class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,0,amount+1,amount+1);
        dp[0]=0;
        for(int coin:coins)
            for(int i=coin;i<=amount;i++)
               dp[i]=Math.min(dp[i],(dp[i-coin]+1));
            
        if(dp[amount]==amount+1)
           return -1;
        else
            return dp[amount];
        
    }
}