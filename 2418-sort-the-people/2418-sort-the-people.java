class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map=new TreeMap<>();
        for(int i=0;i<names.length;i++){
            int a=heights[i];
            String b=names[i];
            map.put(a,b);
       }
        String[] r=new String[names.length];
        int i=names.length-1;
        for(String value:map.values()){
            r[i--]=value;
        }
        return r;
    }
}