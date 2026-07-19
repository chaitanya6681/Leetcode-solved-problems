class Solution {
    public String reverseOnlyLetters(String s) {
        String l="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c>=65 && c<=90)|| (c>=97 && c<=122)) l+=c;
        }
        String r="";
        for(int i=l.length()-1;i>=0;i--){
            r+=l.charAt(i);
        }
        String a="";
        int j=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c>=65 && c<=90)|| (c>=97 && c<=122)){
                a+=r.charAt(j);
                j++;
            } 
            else a+=c;
        }
        return a;
    }
}