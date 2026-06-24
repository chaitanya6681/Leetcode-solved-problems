class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int su=0;
        for(int i=0;i<s.length();i++){
            int r=s.charAt(i)-'0';
            if(i%2==0) su+=r;
            else su-=r;
        }
        return su;
    }
}