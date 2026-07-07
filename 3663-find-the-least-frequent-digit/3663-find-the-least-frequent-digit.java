class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] f=new int[10];
        while(n>0){
            f[n%10]++;
            n/=10;
        }
        int m=Integer.MAX_VALUE;
        int r=10;
        for(int i=0;i<10;i++){
            if(f[i]>0){
                if(f[i]<m||(f[i]==m && i<r)){
                    m=f[i];
                    r=i;
                }
            }
        }
        
return r;
    }
}