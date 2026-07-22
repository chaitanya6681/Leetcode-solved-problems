class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] e=new int[(nums.length+1)/2];
        int[] o=new int[nums.length/2];
        int i=0,j=0;
        for(int h=0;h<nums.length;h++){
            if(h%2==0) e[i++]=nums[h];
            else o[j++]=nums[h];
        }
        Arrays.sort(e);
        Arrays.sort(o);
        int a=0,b=o.length-1;
        for(int k=0;k<nums.length;k++){
            if(k%2==0) nums[k]=e[a++];
            else nums[k]=o[b--];
        }
        return nums;
    }
}