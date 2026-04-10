class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int totalCost = 0;
        int[] minDist = new int[n];
        boolean[] visited = new boolean[n];
        for (int i = 1; i < n; i++) {
            minDist[i] = Integer.MAX_VALUE;
        }        
        for (int count = 0; count < n; count++) {
            int u = -1;
            for (int i = 0; i < n; i++) {
                if (!visited[i] && (u == -1 || minDist[i] < minDist[u])) {
                    u = i;
                }
            }      
            visited[u] = true;
            totalCost += minDist[u];
            for (int v = 0; v < n; v++) {
                if (!visited[v]) {
                    int dist = Math.abs(points[u][0] - points[v][0]) + 
                               Math.abs(points[u][1] - points[v][1]);
                    if (dist < minDist[v]) {
                        minDist[v] = dist;
                    }
                }
            }
        }
        return totalCost;
    }
}