class Running_sum
{
    public int[] runningSum(int[] nums) 
    {
        int sum=0;
        int k=nums.length;
        int[] result = new int[k];
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        result[k-1]=sum;
        for(int i=nums.length-1;i>0;i--)
        {
            sum-=nums[i];
            result[i-1]=sum;
        }
        return result;
    }
}