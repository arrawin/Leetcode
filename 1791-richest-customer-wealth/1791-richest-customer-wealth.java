class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth = 0;
        int sum;
        for(int i = 0 ; i < accounts.length ; i++){
            sum = 0;
            for(int j = 0 ; j < accounts[0].length ; j++){
                sum+=accounts[i][j];
                if(max_wealth<sum){
                    max_wealth = sum;
                }
            }
        }
        return max_wealth;
        
    }
}