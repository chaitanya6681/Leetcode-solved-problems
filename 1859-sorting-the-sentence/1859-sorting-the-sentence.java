class Solution {
    public String sortSentence(String s) {
        String[] a=s.split(" ");
        String[] r=new String[a.length];
        for(String p:a){
            char b=p.charAt(p.length()-1);
            r[b-'0'-1]=p.substring(0,p.length()-1);
        }
        StringBuilder n=new StringBuilder();
        int i=1;
        for(String v:r){
            n.append(v);
            if(i!=a.length) n.append(" ");
            i++;
        }
        return n.toString();
    }
}