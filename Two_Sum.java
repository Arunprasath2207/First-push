import java.util.*;
class Two_Sum
{
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int v;
        for(int i=0;i<nums.length;i++)
        {
            v=target-nums[i];
            if(map.containsKey(v))
                return new int[] {map.get(v),i};
            else
                map.put(nums[i],i);
        }
        return new int[]{};
    }
} 