class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth = 0;
        int sum;
        for(var sal : accounts){
            sum = 0;
            for(int var_sal : sal)
            {
                sum+=var_sal;
                if(max_wealth<sum){
                    max_wealth = sum;
                }
            }
        }
        return max_wealth;
        
    }
}