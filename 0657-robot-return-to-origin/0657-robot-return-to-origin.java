class Solution {
    public boolean judgeCircle(String moves) {
        int s=0;
        for(int i=0;i<moves.length();i++){
            char b=moves.charAt(i);
            switch(b){
                case 'U':s+=1;break;
                case 'D':s-=1;break;
                case 'L':s-=3;break;
                case 'R':s+=3;break;
            }
            System.out.println(s);
        }
        if(s<0) return false;
        else if(s==0) return true;
        else return false;
    }
}