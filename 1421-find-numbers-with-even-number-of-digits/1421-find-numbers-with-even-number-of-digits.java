class Solution {
    private boolean isEven(int n){
      int cnt=0;
      while(n!=0){
          cnt++;
          n=n/10;           
      }
      return cnt%2==0;                    
    }
    public int findNumbers(int[] nums) {
        int cntEven = 0;
        for(int num : nums){
            if(isEven(num)) cntEven++;             
        }     
        return cntEven; 
    }
}