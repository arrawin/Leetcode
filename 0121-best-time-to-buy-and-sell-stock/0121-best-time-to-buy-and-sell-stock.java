class Solution {
    public int maxProfit(int[] prices) {
        int r = 1 , l = 0 , profit = 0 , max_profit = 0;
        while( r < prices.length )
        {
            if(prices[r] > prices[l])
            {
                profit = prices[r] - prices[l];
                if( profit > max_profit ){
                    max_profit = profit;
        
                }
            }
                else{
                    l = r;
                }
            r++;
            }
    
        return max_profit;
       
        
    }
}