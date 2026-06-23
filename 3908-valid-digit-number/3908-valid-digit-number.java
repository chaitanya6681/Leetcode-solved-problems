class Solution {
    public boolean validDigit(int n, int x) {
        int rev=0,c=0;
        while(n>0){
            int r=n%10;
            if(r==x) c++;
            rev*=10+r;
            if(n<10 && n!=x && c>0) return true;
            n/=10;
        }
        return false;
    }
}