class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m+n;
        int[] r=new int[l];
        for(int i=0;i<m;i++) r[i]=nums1[i];
        for(int i=0;i<n;i++) r[m+i]=nums2[i];
        Arrays.sort(r);
        for(int i=0;i<l;i++) nums1[i]=r[i];
    }
}