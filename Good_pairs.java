class Good_pairs
{
    public int numIdenticalPairs(int[] nums) 
    {
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }
        for(Map.Entry mapElement : map.entrySet())
        {
            int value = ((int)mapElement.getValue());
            value-=1;
            int n;
            n = (value*(value+1))/2;
            sum+=n;
        }
        return sum;
    }
}