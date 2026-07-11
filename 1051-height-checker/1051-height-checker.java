import java.util.*;
class Solution {
    public int heightChecker(int[] heights) {
        int[] a=Arrays.copyOf(heights,heights.length);
        Arrays.sort(heights);
        int i=0,r=0;
        for(int n:heights){
            if(a[i]!=n){
                r++;
            }i++;
        } return r;
    }
}