import java.util.*;
class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] m=new int[nums.length];
        for(int i=0;i<nums.length;i++) m[i]=k*(i+1);
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            boolean r=false;
            for(int j=0;j<nums.length;j++){
                if(m[i]==nums[j]){
                    r=true;
                    break;} 
            }
            if(!r) return m[i];
        }
        return k*(nums.length+1);
    }
}