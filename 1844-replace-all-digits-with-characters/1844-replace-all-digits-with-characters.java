class Solution {
    public String replaceDigits(String s) {
        String r="";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                r+=s.charAt(i);
                c=s.charAt(i);
            }
            else{
                int j=s.charAt(i)-48;
                System.out.println(j);
                int k=c+j;
                char b=(char)k;
                System.out.println(b);
                r+=b;
            }
        }
        return r;
    }
}