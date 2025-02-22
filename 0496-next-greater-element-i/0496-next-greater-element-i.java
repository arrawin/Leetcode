class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        // Iterate over nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {

            // If the stack is empty, it means there's no greater element for nums2[i]
            if (st.empty()) {
                map.put(nums2[i], -1);
                st.push(nums2[i]);
            } else {
                // If the top of the stack is less than nums2[i], keep popping the stack
                while (!st.empty() && st.peek() <= nums2[i]) {
                    st.pop();
                }

                // If the stack is empty after popping, no greater element exists
                if (st.empty()) {
                    map.put(nums2[i], -1);
                } else {
                    // Otherwise, the next greater element is at the top of the stack
                    map.put(nums2[i], st.peek());
                }
                
                // Push nums2[i] onto the stack for future comparisons
                st.push(nums2[i]);
            }
        }

        // Prepare the result array based on nums1
        int[] ans = new int[nums1.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}