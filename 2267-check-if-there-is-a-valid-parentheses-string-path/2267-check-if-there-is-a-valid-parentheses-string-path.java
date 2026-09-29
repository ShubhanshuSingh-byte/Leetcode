class Solution {

    Boolean[][][] dp;

    public boolean hasValidPath(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        if ((m + n - 1) % 2 == 1) {
            return false;
        }

        if (grid[0][0] != '(' || grid[m - 1][n - 1] != ')') {
            return false;
        }

        dp = new Boolean[m][n][m + n];

        return v(0, 0, 0, grid);
    }

    public boolean v(int row, int col, int balance, char[][] grid) {

        // Add current character
        if (grid[row][col] == '(') {
            balance++;
        } else {
            balance--;
        }

        // Invalid prefix
        if (balance < 0) {
            return false;
        }

        // Destination
        if (row == grid.length - 1 &&
            col == grid[0].length - 1) {

            return balance == 0;
        }

        // Already calculated
        if (dp[row][col][balance] != null) {
            return dp[row][col][balance];
        }

        boolean ans = false;

        // Down
        if (row + 1 < grid.length) {
            ans = v(row + 1, col, balance, grid);
        }

        // Right
        if (!ans && col + 1 < grid[0].length) {
            ans = v(row, col + 1, balance, grid);
        }

        return dp[row][col][balance] = ans;
    }
}