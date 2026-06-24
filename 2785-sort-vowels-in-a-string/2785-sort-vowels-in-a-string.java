class Solution {
    public String sortVowels(String s) {
        String v="";
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(b=='A' || b=='E'||b=='I'||b=='O'||b=='U'||b=='a' || b=='e'||b=='i'||b=='o'||b=='u'){
                v+=b;
            }
        }
        char[] a=v.toCharArray();
        Arrays.sort(a);
        String r="";
        int k=0;
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(b=='A' || b=='E'||b=='I'||b=='O'||b=='U'||b=='a' || b=='e'||b=='i'||b=='o'||b=='u'){
                r+=a[k++];
            }
            else r+=b;
        }
        return r;
    }
}