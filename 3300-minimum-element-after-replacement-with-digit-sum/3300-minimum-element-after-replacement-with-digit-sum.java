class Solution {
    public int minElement(int[] nums) {
        int m=Integer.MAX_VALUE;
        for(int n:nums){
            int a=0;
            while(n>0){
                int d=n%10;
                a+=d;
                n/=10;
            }
            m=Math.min(a,m);
        } return m;
    }
}