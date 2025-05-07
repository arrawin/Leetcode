class Solution {
    public int minTimeToReach(int[][] m) {
        int[][] directions = {{1,0},{-1,0},{0,-1},{0,1}};
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[2]-b[2]);
        int dis[][] = new int[m.length][m[0].length];
        for(int i[]:dis)
            Arrays.fill(i,Integer.MAX_VALUE);
        dis[0][0] = 0;
        q.add(new int[]{0,0,0});
        while(!q.isEmpty()){
            int u[] = q.poll();
            int x = u[0],y = u[1],d = u[2];

            for(int dir[]:directions){
                int x1 = x+dir[0],y1 = y+dir[1];
                if(x1>=m.length||x1<0||y1>=m[0].length||y1<0)
                    continue;
                int wt = m[x1][y1];
                if((Math.max(d,wt)+1) < dis[x1][y1]){
                    
                    dis[x1][y1] = Math.max(d,wt)+1;
                    q.add(new int[]{x1,y1,dis[x1][y1]});
                }
            }
        }
        return dis[m.length-1][m[0].length-1];
    }
}