class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)) map.put(n,map.get(n)+1);
            else map.put(n,1);
        }
        for(int n:nums){
            if(map.get(n)==nums.length/2) return n;
        }
        return nums[nums.length-1];
    }
}