class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s=new HashSet<>();
        Set<Integer> r=new HashSet<>();
        for(int n:nums1){
            s.add(n);
        }
        for(int n:nums2){
            if(s.contains(n)){
                r.add(n);
            }
        }
        int[] a=new int[r.size()];
        int i=0;
        for(int n:r){
            a[i++]=n;
        }
        return a;
    }
}