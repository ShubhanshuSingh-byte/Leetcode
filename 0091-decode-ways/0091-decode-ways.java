class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);

        return dfs(0, s, dp);
    }

    private int dfs(int i, String s, int[] dp) {
        if (i == s.length()) {
            return 1;
        }

        if (s.charAt(i) == '0') {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        //1
        int ways = dfs(i + 1, s, dp);

        //2
        if (i + 1 < s.length()) {
            int num = Integer.parseInt(s.substring(i, i + 2));

            if (num >= 10 && num <= 26) {
                ways += dfs(i + 2, s, dp);
            }
        }

        dp[i] = ways;
        return dp[i];
    }
}