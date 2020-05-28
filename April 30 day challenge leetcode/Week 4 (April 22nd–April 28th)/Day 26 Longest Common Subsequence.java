class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1 == null || text2 == null || text1.length() == 0 || text2.length() == 0){
            return 0;
        }
        
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        
        for(int i = m; i >= 0; i--){
            for(int j = n; j >= 0; j--){
                if(i == m || j == n){
                    dp[i][j] = 0;
                }
                else if(text1.charAt(i) == text2.charAt(j)){
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        
        return dp[0][0];
    }
}