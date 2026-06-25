class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] r=new int[nums.length];
        int[] l=new int[nums.length];
        r[0]=0;
        l[nums.length-1]=0;
        for(int i=1;i<nums.length;i++) r[i]+=nums[i-1]+r[i-1];
        for(int i=nums.length-2;i>=0;i--) l[i]+=nums[i+1]+l[i+1];
        for(int i=0;i<nums.length;i++) nums[i]=Math.abs(r[i]-l[i]);
        return nums;
        }
}