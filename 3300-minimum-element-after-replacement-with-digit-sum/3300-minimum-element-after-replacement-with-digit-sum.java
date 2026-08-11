class Solution {
    public int minElement(int[] nums) {
        int[] r=new int[nums.length];
        int i=0;
        for(int n:nums){
            int a=0;
            while(n>0){
                int d=n%10;
                a+=d;
                n/=10;
            }
            r[i++]=a;
        } 
        Arrays.sort(r);
        return r[0];
    }
}