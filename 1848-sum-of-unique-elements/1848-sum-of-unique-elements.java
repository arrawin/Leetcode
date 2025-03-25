class Solution {
    public int sumOfUnique(int[] nums) {
           int[] freq = new int[101];
	 for(int n : nums) {
    	   freq[n]++;
     }
     int sum = 0;
     for(int n: nums) {
    	    if(freq[n] == 1) {
    	    	  sum += n;
    	    }
     }
     return sum;
     
    }
}