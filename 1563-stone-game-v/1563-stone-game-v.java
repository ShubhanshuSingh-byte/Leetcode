class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stoneValue[i];
        }

        int[][] memo = new int[n][n];

        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(memo[i], -1);
        }

        return dfs(0, n - 1, prefix, memo);
    }

    private int dfs(int L, int R, int[] prefix, int[][] memo) {
        if (L == R) {
            return 0;
        }

        if (memo[L][R] != -1) {
            return memo[L][R];
        }

        int best = 0;

        for (int m = L; m < R; m++) {
            int left = prefix[m + 1] - prefix[L];
            int right = prefix[R + 1] - prefix[m + 1];

            if (2 * Math.min(left, right) <= best) {
                break;
            }

            if (left <= right) {
                best = Math.max(
                    best,
                    left + dfs(L, m, prefix, memo)
                );
            }
            if (left >= right) {
                best = Math.max(
                    best,
                    right + dfs(m + 1, R, prefix, memo)
                );
            }
        }
        return memo[L][R] = best;
    }
}