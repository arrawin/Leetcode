class Solution {
    public int numSubmat(int[][] mat) {
        int m= mat.length, n= mat[0].length, c=0;
        int[][]wid= new int[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (mat[i][j]==1) wid[i][j]= (j==0?0: wid[i][j-1])+1;
            }
        }
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                int min= wid[i][j];
                for (int k=i; k>=0 && min>0; k--){
                    min= Math.min(min, wid[k][j]);
                    c+= min;
                }
            }
        }
        return c;
    }
}