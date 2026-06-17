class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] r=new int[2*nums.length];
        for(int i=0;i<nums.length;i++)
        r[i]=nums[i];
        int k=1;
        for(int i=nums.length;i<r.length;i++){
        r[i]=nums[nums.length-k];
        k++;
        }
        return r;
    }
}