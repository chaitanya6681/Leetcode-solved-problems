class Solution {
    public String truncateSentence(String s, int k) {
        String[] a=s.split(" ");
        String r="";
        for(int i=0;i<k;i++){
            r+=a[i];
            if(i!=k-1)
            r+=" ";
        }
        return r;
    }
}