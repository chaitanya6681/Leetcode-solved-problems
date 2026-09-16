class Solution {
    public int arraySign(int[] nums) {
        double s=1;
        for(int n:nums){
            s*=n;
            if(n==0) return 0;
        }
        if(s>0) return 1;
        else return -1;
    }
}