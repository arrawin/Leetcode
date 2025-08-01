class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k];
        int n = nums.length;
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr,(a,b) -> b[0] - a[0]);
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < k; i++){
            l.add(arr[i][1]);
        }
        Collections.sort(l);

        for(int i = 0; i <k; i++){
            ans[i] = nums[l.get(i)];
        }
        return ans;
    }
}