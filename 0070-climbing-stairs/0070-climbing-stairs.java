class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return way(0, n);
    }

    public int way(int count, int n)
    {
        if (count > n)
            return 0;

        if (count == n)
            return 1;

        if (dp[count] != -1)
            return dp[count];

        dp[count] = way(count + 1, n) + way(count + 2, n);

        return dp[count];
    }
}