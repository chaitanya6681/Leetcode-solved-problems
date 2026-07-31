class Solution {
    public String sortSentence(String s) {
        String[] a=s.split(" ");
        String[] r=new String[a.length];
        for(String p:a){
            char b=p.charAt(p.length()-1);
            r[b-'0'-1]=p.substring(0,p.length()-1);
        }
        String n="";
        int i=1;
        for(String v:r){
            n+=v;
            if(i!=a.length) n+=" ";
            i++;
        }
        return n;
    }
}