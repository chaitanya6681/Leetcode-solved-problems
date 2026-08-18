class Solution {
    public int countTriples(int n) {
        int m=0;
        for(int a=1;a<=n;a++){
            for(int b=1;b<=n;b++){
                int r=a*a+b*b;
                int c=(int)Math.sqrt(r);
                if(c<=n && c*c==r) m++;
            }
        }
        return m;
    }
}