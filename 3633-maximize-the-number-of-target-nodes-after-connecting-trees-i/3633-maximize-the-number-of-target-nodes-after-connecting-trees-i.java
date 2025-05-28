class Solution {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        int n = 0, m = 0;
        for (int[] e : edges1) n = Math.max(n, Math.max(e[0], e[1]));
        for (int[] e : edges2) m = Math.max(m, Math.max(e[0], e[1]));
        n += 1; m += 1;

        List<Integer>[] graph1 = new ArrayList[n];
        List<Integer>[] graph2 = new ArrayList[m];
        for (int i = 0; i < n; ++i) graph1[i] = new ArrayList<>();
        for (int i = 0; i < m; ++i) graph2[i] = new ArrayList<>();
        for (int[] e : edges1) {
            graph1[e[0]].add(e[1]);
            graph1[e[1]].add(e[0]);
        }
        for (int[] e : edges2) {
            graph2[e[0]].add(e[1]);
            graph2[e[1]].add(e[0]);
        }

        // Precompute reachability within k-1 in tree2
        int[] tree2Reach = new int[m];
        for (int j = 0; j < m; j++) {
            tree2Reach[j] = countReachableWithinK(j, graph2, k - 1);
        }

        // Precompute max reachable in tree2 from any node
        int maxTree2Reach = 0;
        for (int val : tree2Reach) {
            maxTree2Reach = Math.max(maxTree2Reach, val);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int reachableInTree1 = countReachableWithinK(i, graph1, k);
            result[i] = reachableInTree1 + maxTree2Reach;
        }

        return result;
    }

    private int countReachableWithinK(int start, List<Integer>[] graph, int k) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        int level = 0;
        int count = 0;
        while (!queue.isEmpty() && level <= k) {
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                int node = queue.poll();
                count++;
                for (int nei : graph[node]) {
                    if (!visited[nei]) {
                        visited[nei] = true;
                        queue.offer(nei);
                    }
                }
            }
            level++;
        }
        return count;
    }
}