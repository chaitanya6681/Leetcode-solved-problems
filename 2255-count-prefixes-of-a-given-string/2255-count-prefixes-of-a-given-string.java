class Solution {
    public int countPrefixes(String[] words, String s) {
        int n=s.length();
        int r=0;
        for(int i=0;i<words.length;i++){
            String a=words[i];
            if (a.length() > s.length())
                continue;
            int c=0;
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)==s.charAt(j)) c++;
                else break;
            }
            if(c==a.length()){
                r++;
            } 
        } return r;
    }
}