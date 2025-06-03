class Solution {
    public boolean check(boolean visited[][],int i,int j)
    {
        for(int x=i-1;x>=0;x--)
        {
            if(visited[x][j])return true;
        }
        for(int x=i-1,y=j-1;x>=0&&y>=0;x--,y--)
        {
            if(visited[x][y])return true;
        }
        for(int x=i-1,y=j+1;x>=0&&y<visited.length;x--,y++)
        {
            if(visited[x][y])return true;
        }
        return false;
    }
    public ArrayList<String> convert(boolean[][] visited)
    {
        ArrayList<String> res=new ArrayList<>();
        int n=visited.length;
        for(int i=0;i<n;i++)
        {
            String str="";
            for(int j=0;j<n;j++)
            {
                if(visited[i][j])
                {
                    str+="Q";
                }
                else
                {
                    str+=".";
                }
            }
            res.add(str);
        }
        return res;
    }
    public void help(List<List<String>> res,int n,boolean [][]visited,int i)
    {
        if(i==n)
        {
            res.add(new ArrayList<>(convert(visited)));
            return;
        }

        for(int j=0;j<n;j++)
        {
            if(check(visited,i,j))continue;
            visited[i][j]=true;
            help(res,n,visited,i+1);
            visited[i][j]=false;
        }
    }
    public List<List<String>> solveNQueens(int n) {
        boolean[][] visited=new boolean[n][n];
        List<List<String>> res=new ArrayList<>();
        help(res,n,visited,0);
        return res;
    }
}