class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 , high = 0 ;
        for(int i = 0 ; i < piles.length ; i++){
            high = Math.max(piles[i],high);
        }
        int res = high;
        while(low<=high){
            int mid = low+(high-low)/2 ;
            long totalHr = 0;
            for(int i = 0 ; i < piles.length ; i++){
                totalHr += (piles[i] + mid - 1) / mid;
            }
            if(totalHr <= h){
                 res = mid;
                 high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        
    }
    return res;
}
}