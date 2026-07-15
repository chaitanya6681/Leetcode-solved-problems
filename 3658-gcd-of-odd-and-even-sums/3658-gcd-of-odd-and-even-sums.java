class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n==1) return 1;
        int o=(int)Math.pow(n,2);
        int e=n*(n+1);
        int m=Math.min(o,e);
        int r=0;
        for(int i=1;i<m;i++){
            if(o%i==0 && e%i==0) r=i;
        }
        return r;
    }
}