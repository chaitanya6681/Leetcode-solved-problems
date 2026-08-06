class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;;i++){
            int p=1,a=i;
            while(a>0){
                p*=(a%10);
                a/=10;
            }
            if(p%t==0) return i;
        }
    }
}