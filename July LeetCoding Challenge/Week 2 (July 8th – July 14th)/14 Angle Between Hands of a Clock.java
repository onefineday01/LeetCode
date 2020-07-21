class Solution {
    public double angleClock(int hour, int minutes) {
        double hd = (30*hour + minutes/2.0) % 360;
        double md = (minutes/60.0) * 360.0 ; 
        return Math.min(Math.abs(hd-md), 360 - Math.abs(hd-md));
    }
}