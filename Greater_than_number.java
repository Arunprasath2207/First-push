class Greater_than_number
{
    public int[] smallerNumbersThanCurrent(int[] n)
    {
        int[] a = new int[n.length];
        for(int i=0;i<n.length;i++)
        {
            int count =0;
            for(int j=0;j<n.length;j++)
            {
                if(n[i]>n[j])
                    count++;
            }
            a[i]=count;
        }
        return a;
    }
}