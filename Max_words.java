class Max_words
{
    public int mostWordsFound(String[] s)
    {
        int max=0;
        for(int i=0;i<s.length;i++)
        {
            int count=1;
            char[] c = s[i].toCharArray();
            for(int j=0;j<c.length;j++)
            {
                if(c[j]==' ')
                    count++;
            }
            max=count>max?count:max;
        }
        return max;
    }
}