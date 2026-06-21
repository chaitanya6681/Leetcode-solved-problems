class Solution {
    public boolean checkGoodInteger(int n) {
        String r="";
        while(n>0){
            r+=n%10;
            n/=10;
        }
        int[] ar=new int[r.length()];
        for(int i=0;i<r.length();i++){
            ar[i]=r.charAt(i)-'0';
        }
        int d=0,s=0;
        for(int i=0;i<r.length();i++){
            d+=ar[i];
            s+=ar[i]*ar[i];
        }
        return (s-d>=50);
    }
}