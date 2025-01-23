class Solution {
    public int countServers(int[][] grid) {
       int count = 0;
       int[] rowServer = new int[grid.length];
       int[] colServer = new int[grid[0].length];
       for(int i = 0 ; i < grid.length ; i++){
        for(int j = 0 ; j < grid[0].length ; j++){
            if(grid[i][j]==1){
                rowServer[i]++;
                colServer[j]++;
            }
        }
       }
        for(int i = 0 ; i < grid.length ; i++){
        for(int j = 0 ; j < grid[0].length ; j++){
            if(grid[i][j]==1){
                if(rowServer[i]>1 || colServer[j]>1){
                    count++;
                }
            }
        }
        }
        return count;
        }
}