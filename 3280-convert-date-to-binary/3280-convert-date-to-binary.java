import java.util.*;
class Solution {
    public String convertDateToBinary(String date) {
        String[] s=date.split("-");
        String r="";
        for(int i=0;i<s.length;i++){
           int n=Integer.parseInt(s[i]);
           r+=Integer.toBinaryString(Integer.parseInt(s[i]));
           if(i!=s.length-1)
           r+="-";
        }
        return r;
    }
}