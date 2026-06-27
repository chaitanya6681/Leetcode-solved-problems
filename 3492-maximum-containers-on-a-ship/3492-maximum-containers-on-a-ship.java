class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int r=0;
        for(int i=1;i<=n*n;i++){
            if(i*w<=maxWeight) r=i;
        }
        return r;
    }
}