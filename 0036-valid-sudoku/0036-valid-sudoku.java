class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<9; i++){    
            for(int j=0; j<9; j++){
                if(board[i][j]=='.') continue;
                char curr = board[i][j];
                if(!set.add(curr + "rows at" + (char)i)
                || !set.add(curr + "cols at" + (char)j)
                || !set.add(curr + "grid at" + i/3 + "-" + j/3))
                    return false;
            }
        }

        return true;
    }
}