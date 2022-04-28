class Remove_Element_by_given_value
{
    public int[] shift(int i,int[] a,int count)
    {
        for(int j=i;j<a.length;j++)
        {
          if(j<=(a.length-count)-1)
             a[j]=a[j+count];   
          else
              a[j]=-1;
        }
        return a;
    }
    public int removeElement(int[] nums, int val) 
    {
        int count1=0;
        int count2=0;
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]==val)
           {
               count1++;
               count2++;
           }
           else if(count1>0 && nums[i]!=val)
           {
               nums=shift((i-count1),nums,count1);
               i=i-count1;
               count1=0;
           }
       }
        return nums.length-count2;
    }
}