class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] res = new int[n];
        Set<Integer> set = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (!set.add(A[i]))
                cnt++;
            if (!set.add(B[i]))
                cnt++;
            res[i] = cnt;
        }
        return res;
    }
}