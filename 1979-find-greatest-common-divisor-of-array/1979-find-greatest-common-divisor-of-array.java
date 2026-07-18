import java.util.*;
class Solution {
    public int findGCD(int[] nums) {
            //Arrays.sort(nums);
            int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
            for(int n:nums){
                if(n<min) min=n;
                if(n>max) max=n;
            }
            //int a=nums[0],b=nums[nums.length-1];
            int r=1;
            for(int i=1;i<=max;i++){
                if(min%i==0 && max%i==0) r=i;
            }
            return r;
    }
}