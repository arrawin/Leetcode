import java.util.*;

public class Solution {
    static class SegmentTree {
        int[] tree;
        int n;

        public SegmentTree(int[] baskets) {
            n = baskets.length;
            int size = 1;
            while (size < n) size <<= 1;
            tree = new int[size * 2];
            Arrays.fill(tree, Integer.MIN_VALUE);
            for (int i = 0; i < n; i++) tree[size + i] = baskets[i];
            for (int i = size - 1; i > 0; i--) {
                tree[i] = Math.max(tree[i << 1], tree[i << 1 | 1]);
            }
        }

        void update(int idx) {
            int pos = idx + tree.length / 2;
            tree[pos] = Integer.MIN_VALUE;
            for (pos >>= 1; pos > 0; pos >>= 1) {
                tree[pos] = Math.max(tree[pos << 1], tree[pos << 1 | 1]);
            }
        }

        int query(int val) {
            return query(1, 0, tree.length / 2 - 1, val);
        }

        private int query(int node, int l, int r, int val) {
            if (tree[node] < val) return -1;
            if (l == r) return l;
            int mid = (l + r) / 2;
            int res = query(node * 2, l, mid, val);
            if (res != -1) return res;
            return query(node * 2 + 1, mid + 1, r, val);
        }
    }

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        SegmentTree st = new SegmentTree(baskets);
        int unplaced = 0;
        for (int fruit : fruits) {
            int idx = st.query(fruit);
            if (idx == -1) {
                unplaced++;
            } else {
                st.update(idx);
            }
        }
        return unplaced;
    }
}