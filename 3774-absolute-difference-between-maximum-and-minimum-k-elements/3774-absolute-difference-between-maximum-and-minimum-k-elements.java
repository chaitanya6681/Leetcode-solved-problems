class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int a=0,b=0,j=nums.length-1;
        for(int i=0;i<k;i++){
            a+=nums[i];
            b+=nums[j--];
        }
        return Math.abs(a-b);
    }
}