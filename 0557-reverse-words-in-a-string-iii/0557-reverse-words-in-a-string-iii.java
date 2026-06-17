class Solution {
    public String reverseWords(String s) {
        String[] w=s.split(" ");
        String ans="";
        for(int i=0;i<w.length;i++){
            String a=w[i];
            String r="";
            for(int j=a.length()-1;j>=0;j--){
                r+=a.charAt(j);
            }
            ans+=r;
            if(i!=w.length-1)
            ans+=" ";
        }
        return ans;
    }
}