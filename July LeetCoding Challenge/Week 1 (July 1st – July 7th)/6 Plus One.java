class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry =1;
        for(int i=n-1;i>=0;i--)
        {
            if(carry==1){
                digits[i]++;
                carry = digits[i]/10;
                digits[i]=digits[i]%10;
            }
            if(i==0 && carry==1){
                int nar[] = new int[n+1];
                nar[i] =1;
                for(int j=1;j<=n;j++)
                    nar[j]=digits[j-1];
                digits = nar;
            }
        }
        return digits;
    }
}