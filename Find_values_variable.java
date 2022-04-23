class Solution
{
    public int finalValueAfterOperations(String[] o) 
    {
        int k=0;
        for(int i=0;i<o.length;i++)
        {
            char[] c = o[i].toCharArray();
            if(c[0]=='-' || c[1]=='-')
                k=k-1;
            else
                k=k+1;
        }
        return k;
    }
}