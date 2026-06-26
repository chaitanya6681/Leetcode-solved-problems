class Solution {
    public int countEven(int num) {
        int a=0;
        for(int i=1;i<=num;i++){
            int n=i,r=0;
            while(n>0){
                r+=n%10;
                n/=10;
            }
            if(r%2==0) a++;
        } return a;
    }
}