class Solution {
    public void helper( boolean[][] visited , int row , int col , int[][] mat)
    {
        for(int i = 0 ; i < mat.length ; i++)
        {
            if(mat[i][col]!=0)
            {
                mat[i][col] = 0;
                visited[i][col] = true;
            }
        }
         for(int i = 0 ; i < mat[0].length ; i++)
        {
            if(mat[row][i]!=0)
            {
                mat[row][i] =  0;
                visited[row][i] = true;
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        for(int row_ind = 0 ; row_ind < matrix.length ; row_ind++)
        {
            for(int col_ind = 0 ; col_ind < matrix[0].length ; col_ind++)
            {
                if(matrix[row_ind][col_ind]==0 && visited[row_ind][col_ind]==false)
                {
                    helper(visited , row_ind , col_ind , matrix);
                }
                
            }
        }
        
    }
}