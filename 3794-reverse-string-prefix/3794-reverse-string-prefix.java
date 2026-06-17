class Solution {
    public String reversePrefix(String s, int k) {
        String r="";
        for(int i=k-1;i>=0;i--){
            r+=s.charAt(i);
        }
        System.out.println(r);
        String f="";
        f+=r;
        for(int i=k;i<s.length();i++){
            f+=s.charAt(i);
        }
        return f;
    }
}