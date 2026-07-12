import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] s=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            s[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            s[nums1.length+i]=nums2[i];
        }
        Arrays.sort(s);
        if(s.length%2!=0) return (double)(s[s.length/2]);
        else return (s[s.length/2-1]+s[s.length/2])/2.0;
    }
}