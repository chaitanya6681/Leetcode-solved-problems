class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] p=new int[nums.length/2];
        int[] ne=new int[nums.length/2];
        int i=0,j=0,a=0,b=0;
        for(int n:nums){
            if(n>0) p[i++]=n;
            else ne[j++]=n;
        }
        for(int k=0;k<nums.length;k++){
            if(k%2==0) nums[k]=p[a++];
            else nums[k]=ne[b++];
        }
        return nums;
    }
}