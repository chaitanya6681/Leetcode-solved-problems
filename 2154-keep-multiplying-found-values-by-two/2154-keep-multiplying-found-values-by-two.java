class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)) map.put(n,map.get(n)+1);
            else map.put(n,1);
        }
        int a=original;
        if(!map.containsKey(original)) return original;
        else{
            while(map.containsKey(a)){
                a*=2;
            }
            return a;
        }
    }
}