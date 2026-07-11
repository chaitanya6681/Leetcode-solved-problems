import java.util.*;
class Solution {
    public int heightChecker(int[] heights) {
        int[] a=Arrays.copyOf(heights,heights.length);
        Arrays.sort(heights);
        int r=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=a[i]) r++;
        } return r;
    }
}