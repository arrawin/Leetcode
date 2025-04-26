class Solution {

    public void dfs(int r,int c,char[][] grid,int visited[][],int row,int col){
        visited[r][c]=1;
        if(c+1<col&&visited[r][c+1]==0 && grid[r][c+1]=='1'){
            dfs(r,c+1,grid,visited,row,col);
        }
        if(r+1<row&&visited[r+1][c]==0 && grid[r+1][c]=='1'){
            dfs(r+1,c,grid,visited,row,col);
        }
        if(c>0&&visited[r][c-1]==0 && grid[r][c-1]=='1'){
            dfs(r,c-1,grid,visited,row,col);
        }
        if(r>0&&visited[r-1][c]==0 && grid[r-1][c]=='1'){
            dfs(r-1,c,grid,visited,row,col);
        }
    }

    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int visited[][]=new int[r][c];
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'&&visited[i][j]==0){
                    count++;
                    dfs(i,j,grid,visited,r,c);
                }
            }
        }
        return count;
    }
}