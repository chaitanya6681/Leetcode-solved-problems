import java.util.*;

class Solution {
    public int mostFrequentEven(int[] nums) {
        int m = 0, r = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }
        int a=0;
        for (int n : nums) {
            if (n % 2 == 0) {
                if (map.get(n) > m ) {
                    m = map.get(n);
                    r=n;
                }
                else if(map.get(n)==m &&(n<r)) r=n;
            }
        }
        return r;
    }
}