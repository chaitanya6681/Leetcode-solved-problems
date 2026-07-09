class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])) map.put(nums[i],map.get(nums[i])+1);
            else map.put(nums[i],1);
        }
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>m) m=map.get(nums[i]);
        }
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==m) r++;
        }
        return r;
    }
}