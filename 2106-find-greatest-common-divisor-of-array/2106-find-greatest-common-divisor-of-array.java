class Solution {
    public int findGCD(int[] nums) {
        int arr_max = Integer.MIN_VALUE , arr_min= nums[0];
        for(int arr_index = 0 ; arr_index < nums.length ; arr_index++)
        {
            if(nums [ arr_index ] > arr_max)
            {
                arr_max = nums [ arr_index ];
            }
            if(nums [ arr_index ] < arr_min)
            {
                arr_min = nums [ arr_index ];
            }
            
        } 
      
        if( arr_max % arr_min == 0 )
        {
            return arr_min;
        }
        else{
            int GCD;
            for(GCD = arr_min ; GCD>1 ; GCD-=1){
                if(arr_max%GCD==0 && arr_min%GCD==0)
                {
                    break;
                }
            }
            return GCD;
        }
        
    }
}