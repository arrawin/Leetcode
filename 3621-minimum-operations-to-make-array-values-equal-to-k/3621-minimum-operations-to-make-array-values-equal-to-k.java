class Solution {
    public int minOperations(int[] nums, int k) {
        int operationCount = 0;
        boolean[] occurrences = new boolean[101];
        for (int num : nums) {
            if (num < k) {
                return -1;
            }
            if (num > k && !occurrences[num]) {
                occurrences[num] = true;
                operationCount++;
            }
        }
        return operationCount;
    }
}