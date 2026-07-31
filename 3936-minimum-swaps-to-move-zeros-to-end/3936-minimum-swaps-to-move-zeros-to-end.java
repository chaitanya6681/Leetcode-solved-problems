class Solution {
    public int minimumSwaps(int[] nums) {
        int z=0,s=0;
        for(int n:nums) if(n==0) z++;
        for(int i=0;i<nums.length-z;i++){
            if(nums[i]==0) s++;
        } return s;
    }
}