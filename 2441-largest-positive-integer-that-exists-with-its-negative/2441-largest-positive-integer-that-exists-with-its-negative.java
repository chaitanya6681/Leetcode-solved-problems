class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int n:nums) s.add(n);
        int r=-1;
        for(int n:nums){
            if(n>0 && s.contains(-n)) r=Math.max(r,n);
        } return r;
    }
}