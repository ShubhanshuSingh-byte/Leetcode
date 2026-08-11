class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1) return 0; //start block has obstacle

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;

        // 1st row initialisation
        for(int col=1; col<n; col++){
            if(obstacleGrid[0][col]==0 && dp[0][col-1]==1){
                dp[0][col]=1;
            }
            else{
                break;
            }
        }

        //1st col initialisation
        for(int row=1; row<m; row++){
            if(obstacleGrid[row][0]==0 && dp[row-1][0]==1){
                dp[row][0]=1;
            }
            else{
                break;
            }
        }

        for(int row=1; row<m; row++){
            for(int col=1; col<n; col++){
                if(obstacleGrid[row][col]==0){
                    dp[row][col] = dp[row-1][col] + dp[row][col-1];
                }
                else{
                    dp[row][col] = 0;
                }
            }
        }

        return dp[m-1][n-1];
    }
}