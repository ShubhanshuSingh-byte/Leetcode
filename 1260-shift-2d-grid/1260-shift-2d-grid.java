class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res = new ArrayList<>();

        int m = grid.length;
        int n = grid[0].length;

        if(k%(m*n)==0){
            for (int i = 0; i < m; i++) {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    list.add(grid[i][j]);
                }
                res.add(list);
            }
            return res;
        }

        int[][] arr = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int val = i * n + j;
                int newVal = (val + k) % (m * n);
                int row = newVal / n;
                int col = newVal % n;

                arr[row][col] = grid[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(arr[i][j]);
            }
            res.add(list);
        }

        return res;
    }
}