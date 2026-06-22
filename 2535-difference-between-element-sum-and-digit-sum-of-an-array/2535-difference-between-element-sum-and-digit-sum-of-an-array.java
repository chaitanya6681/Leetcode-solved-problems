class Solution {
    public int differenceOfSum(int[] nums) {
        int e=0;
        int d=0;
        for(int i=0;i<nums.length;i++){
            e+=nums[i];
            while(nums[i]>0){
                d+=nums[i]%10;
                nums[i]/=10;
            }
        }
        return Math.abs(d-e);
    }
}