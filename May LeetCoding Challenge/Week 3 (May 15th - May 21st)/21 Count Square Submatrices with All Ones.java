class Solution {
    public int countSquares(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length, sum = 0;
        int arr[][] = new int[n+1][m+1];
        for(int i = 1; i <=n ; i++)
            for(int j = 1; j <= m; j++)
                if(matrix[i-1][j-1] == 1){
                    arr[i][j] = Math.min(Math.min(arr[i-1][j], arr[i][j-1]), arr[i-1][j-1]) + 1;
                    sum += arr[i][j];
                }
        return sum;
    }
}