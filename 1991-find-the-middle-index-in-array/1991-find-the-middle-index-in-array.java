class Solution {
    public int findMiddleIndex(int[] nums) {
        int t=0,l=0;
        for(int i=0;i<nums.length;i++) t+=nums[i];
        for(int i=0;i<nums.length;i++) {
           
            if(l==t-l-nums[i]) return i; l+=nums[i];
        }
        return -1;
    }
}