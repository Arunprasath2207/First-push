class Shuffle_array
{
    public int[] shuffle(int[] nums, int n) 
    {
        int[] r = new int[nums.length];
        int i=0;
        int j=n;
        int k=0;
        while(j!=nums.length)
        {
            r[k++]=nums[i];
            r[k++]=nums[j];
            i++;
            j++;
        }
        return r;
    }
}