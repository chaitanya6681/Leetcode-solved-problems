class Solution {
    public int averageValue(int[] nums) {
        int s=0,k=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%6==0) {
                s+=nums[i];k++;
            }
        }
        k--;
        if(k==0) return 0;
        else return s/k;
    }
}