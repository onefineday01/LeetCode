class Solution {
    public int arrangeCoins(int a) {
        long n = a;
        if(n == 1) return 1;
        long l = 1,h = n;
        long mid = (l+h)/2;
        while(l < h){
            mid = (l+h)/2;
            if(midOk(mid, a)) l = mid+1;
            else h = mid;
        }
        return (int)l-1;
    }
    boolean midOk(long m, long n){
        return (m * (m+1))/2 <= n;
    }
}