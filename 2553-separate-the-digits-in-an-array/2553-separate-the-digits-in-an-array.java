class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int n:nums){
            String a=Integer.toString(n);
            for(int i=0;i<a.length();i++) l.add(a.charAt(i)-'0');

        }
        int[] arr=new int[l.size()];
        for(int i=0;i<l.size();i++) arr[i]=l.get(i);
        return arr;

    }
}