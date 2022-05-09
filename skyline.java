class skyline
{
    public int maxrow(int j,int[][] g)
    {
        int max=0;
        for(int i=0;i<g.length;i++)
        {
            if(g[j][i]>max)
                max=g[j][i];
        }
        return max;
    }
    public int maxcolumn(int j,int[][] g)
    {
        int max=0;
        for(int i=0;i<g.length;i++)
        {
            if(g[i][j]>max)
                max=g[i][j];
        }
        return max;
    }
    public int maxIncreaseKeepingSkyline(int[][] g) 
    {
        int sum=0;
        int a;
        for(int i=0;i<g.length;i++)
        {
            int max=maxrow(i,g);
            for(int j=0;j<g.length;j++)
            {
                int max1=maxcolumn(j,g);
                a=max<max1?max:max1;
                sum+=(a-g[i][j]);
            }
        }
        return sum;
    }
}