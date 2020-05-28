class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length==0)
            return 0;
        int maxarea=0;
        int n = matrix.length;
        int m = matrix[0].length;
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0){
                    arr[i][j]=(int)(matrix[i][j]-'0');
                    if(maxarea<arr[i][j])
                        maxarea=arr[i][j];
                }
                else if(matrix[i][j]=='0')
                    arr[i][j]=0;
                else if(matrix[i][j]=='1'){
                    int min = Math.min(arr[i-1][j-1], arr[i-1][j]);
                    min = Math.min(min, arr[i][j-1]);
                    arr[i][j]=min+1;
                    if(maxarea<arr[i][j])
                        maxarea=arr[i][j];
                }
            }
        }
        return maxarea*maxarea;
    }
}