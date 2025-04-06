class Solution {
    public int[] reverseArray(int[] arr , int start , int end)
    {
        int temp;
        for (int ind1 = start, ind2 = end ; ind1 < ind2; ind1++, ind2--) {
          temp = arr[ind1];
          arr[ind1] = arr[ind2];
          arr[ind2] = temp;
         }
        return arr;

    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);
        
    }
}