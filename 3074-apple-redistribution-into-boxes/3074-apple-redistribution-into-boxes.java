import java.util.*;
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int s=0;
        for(int n:apple) s+=n;
        Arrays.sort(capacity);
        int n=0,r=0;
        for(int i=capacity.length-1;i>=0;i--){
            
            n+=capacity[i];
            r++;
            if(n>=s) return r;
        }
        return r;
    }
}