class Solution {
    public int secondHighest(String s) {
        int a=-1,m=-1;
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(b>='0' && b<='9'){
                int n=b-'0';
                if(n>a){
                    m=a;
                    a=n;
                }else if(n>m && n<a){
                    m=n;
                }
                
            }
        } return m;
    }
}