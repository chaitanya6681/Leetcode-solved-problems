class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans=0;
        for(int i=0;i<words.length;i++){
            String a=words[i];
            int c=0;
            for(int j=0;j<a.length();j++){
                
                for(int k=0;k<allowed.length();k++){
                    if((a.charAt(j))==(allowed.charAt(k)))
                    c++;
                }
            }
            if(c==a.length()) ans++;
        }
        return ans;
    }
}