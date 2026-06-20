class Solution {
    public int divide(int dividend, int divisor) {
        int r=Math.abs(dividend/divisor);
        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        else if(dividend<0 && divisor>0 || divisor<0 && dividend>0){
            return r*-1;
        }
        else return r;
    }
}