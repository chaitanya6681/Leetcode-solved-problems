class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0,max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[min]) min=i;
            if(nums[i]>nums[max]) max=i;
        }
        int a=Math.max(min,max)+1;
        int b=nums.length-Math.min(min,max);
        int c=Math.min(min,max)+1+nums.length-Math.max(min,max);
        return Math.min(a,Math.min(b,c));
    }
}