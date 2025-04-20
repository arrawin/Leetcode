class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;
        int curr;
        boolean arr[] = new boolean[n+1];

        for(int i = 0; i < n; i++) {
            curr = nums[i];
            if (nums[i] > 0 && nums[i] <= n) {
                arr[curr] = true;
            }
        }

        for (int i = 1; i < n+1; i++) {
            if (!arr[i]) {
                return i;
            }
        }

        return n + 1;
    }
}