class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int n=searchWord.length();
        int r=-1;
        String[] words=sentence.split(" ");
        for(int i=0;i<words.length;i++){
            String a=words[i];
            if (a.length() < n)
                continue;
            int c=0;
            int k=0;
            for(int j=0;j<n;j++){
                if(a.charAt(j)==searchWord.charAt(k)){
                    k++;
                    c++;
                }
            }
            if(c==n) return i+1;
        }
        return r;
    }
}