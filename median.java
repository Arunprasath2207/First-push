import java.util.*;
class median
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int len = nums1.length + nums2.length;
        int[] nums3 = new int[len];
        System.arraycopy(nums1,0,nums3,0,nums1.length);
        System.arraycopy(nums2,0,nums3,nums1.length,nums2.length);
        Arrays.sort(nums3);
        double median;
        if(len%2==0)
        {
            median=((double)nums3[(len/2)-1]+(double)nums3[len/2])/2;
        }
        else
        {
            median=nums3[len/2];
        }
        return median;
    }
}