class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] e=new int[nums.length/2];
        int[] o=new int[nums.length/2];
        int i=0,j=0;
        for(int n:nums){
            if(n%2==0) e[i++]=n;
            else o[j++]=n;
        }
        int a=0,b=0;
        for(int k=0;k<nums.length;k++){
            if(k%2==0) nums[k]=e[a++];
            else nums[k]=o[b++];
        }
        return nums;
    }
}