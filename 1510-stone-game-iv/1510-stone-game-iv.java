class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[100000+1];
        dfs(dp);
        return dp[n];
    }

    public void dfs(boolean[] dp){
        for(int i=0; i<=100000; i++){
            if(dp[i]) continue;

            for(int j=1; j*j<=100000-i; j++){
                dp[i+j*j] = true;
            }
        }
    }

}