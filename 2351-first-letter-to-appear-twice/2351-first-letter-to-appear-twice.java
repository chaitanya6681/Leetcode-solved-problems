class Solution {
    public char repeatedCharacter(String s) {
        int[] f=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            f[c-'a']++;
            if(f[c-'a']==2) return c;
        }
        return ' ';
    }
}