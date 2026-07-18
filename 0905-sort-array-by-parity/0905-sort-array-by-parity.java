class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] r=new int[nums.length];
        int a=0,b=nums.length-1;
        for(int n:nums){
            if(n%2==0) r[a++]=n;
            else r[b--]=n;
        }
        return r;
    }
}