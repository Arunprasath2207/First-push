class Remove_dup
{
    public int removeDuplicates(int[] nums) 
    {
        int count =0;
        int a=nums[0];
        int k=1;
        int[] expectedNums = new int[nums.length];
        for(int i=0;i<nums.length-1;i++)
        {
            if(a==nums[i+1])
               count++;
            else
            {
               nums[k]=nums[i+1];
               a=nums[i+1];
               k++;
            }
        }
        return nums.length-count;
    }
}