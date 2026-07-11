class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int s=0;
        for(int i=0;i<seats.length;i++){
            if(Math.abs(seats[i]-students[i])>0) s+=Math.abs(seats[i]-students[i]);
        } return s;
    }
}