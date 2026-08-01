class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] r=new int[nums.length];
        int i=0;
        for(int n:nums){
            r[i++]=(n*n);
        }
        Arrays.sort(r);
        return r;
    }
}