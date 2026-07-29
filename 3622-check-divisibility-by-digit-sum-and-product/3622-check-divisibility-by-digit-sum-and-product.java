class Solution {
    public boolean checkDivisibility(int n) {
        int a=0,m=1,num=n;
        while(n>0){
            int c=n%10;
            a+=c;
            m*=c;
            n/=10;
        }
        return num%(a+m)==0;
    }
}