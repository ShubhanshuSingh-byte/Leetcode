class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {

                    for (int n = 1; n <= 9; n++) {

                        if (possible(i, j, n, board)) {

                            board[i][j] = (char)(n + '0');

                            if (solve(board)) {
                                return true;
                            }

                            board[i][j] = '.';
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    public boolean possible(int x, int y, int n, char[][] board) {

        char num = (char)(n + '0');

        // Row
        for (int i = 0; i < 9; i++) {
            if (board[x][i] == num) {
                return false;
            }
        }

        // Column
        for (int i = 0; i < 9; i++) {
            if (board[i][y] == num) {
                return false;
            }
        }

        // 3 x 3 box
        int x0 = (x / 3) * 3;
        int y0 = (y / 3) * 3;

        for (int i = x0; i < x0 + 3; i++) {
            for (int j = y0; j < y0 + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}