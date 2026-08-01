class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]=='.') continue;
                if(!set.add(board[i][j] + "r" + i)
                || !set.add(board[i][j] + "c" + j)
                || !set.add(board[i][j] + "g" + i/3 + "-" + j/3))
                return false;
            }
        }

        return true;
    }
}