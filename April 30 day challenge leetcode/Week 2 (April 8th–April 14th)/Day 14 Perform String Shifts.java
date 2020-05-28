class Solution {
    public String stringShift(String s, int[][] shift) {
        if(shift == null)
            return s;
        
        int n =  s.length();
        int dir = 0;
        int amount = 0;
        for(int i = 0; i<shift.length;i++){
            int d1 = shift[i][0];
            int a1 = shift[i][1];
            if(dir == d1){
                amount += a1;
            }
            else if(amount >= a1){
                amount -= a1;
            }
            else{
                dir ^= 1;
                amount = a1 - amount;
            }
        }
        amount = amount % n;
        if(amount == 0)
            return s;
        StringBuilder sb = new StringBuilder();
        StringBuilder nsb = new StringBuilder();
        sb.append(s);
        if(dir == 1){
            nsb.append(s.substring(n-amount));
            nsb.append(s.substring(0, n-amount));
        }
        else{
            nsb.append(s.substring(amount));
            nsb.append(s.substring(0, amount));
        }
        return nsb.toString();
    }
}