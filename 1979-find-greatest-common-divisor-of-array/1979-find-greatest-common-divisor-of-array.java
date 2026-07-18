import java.util.*;
class Solution {
    public int findGCD(int[] nums) {
            Arrays.sort(nums);
            int a=nums[0],b=nums[nums.length-1];
            int r=1;
            for(int i=1;i<=b;i++){
                if(a%i==0 && b%i==0) r=i;
            }
            return r;
    }
}