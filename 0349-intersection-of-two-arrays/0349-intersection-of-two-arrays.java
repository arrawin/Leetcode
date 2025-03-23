class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        HashSet<Integer> res = new HashSet<>();
        int ind1 = 0, ind2 = 0;

        while (ind1 < nums1.length && ind2 < nums2.length) {
            if (nums1[ind1] < nums2[ind2]) {
                ind1++;
            } else if (nums1[ind1] > nums2[ind2]) {
                ind2++;
            } else {
                res.add(nums1[ind1]);
                ind1++;
                ind2++;
            }
        }

        int[] ans = new int[res.size()];
        int i = 0;
        for (int num : res) {
            ans[i++] = num;
        }

        return ans;
    }
}
