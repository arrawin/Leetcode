class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        boolean[] inRecursion = new boolean[n];
        List<Integer> safeNodes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited, inRecursion);
            }
        }

        for (int i = 0; i < n; i++) {
            if (!inRecursion[i]) {
                safeNodes.add(i);
            }
        }

        return safeNodes;
    }

    private boolean dfs(int node, int[][] graph, boolean[] visited, boolean[] inRecursion) {
        if (inRecursion[node]) {
            return false;
        }
        if (visited[node]) {
            return true; 
        }

        visited[node] = true;
        inRecursion[node] = true;

        for (int neighbor : graph[node]) {
            if (!dfs(neighbor, graph, visited, inRecursion)) {
                return false; 
            }
        }

        inRecursion[node] = false; 
        return true; 
    }
}