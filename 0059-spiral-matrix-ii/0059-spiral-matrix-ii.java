class Solution {
    public int[][] generateMatrix(int a) {
        int[][] mat = new int[a][a];
        int m = mat.length, n = mat[0].length;
        int count=1;

        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; ++i) {
                mat[top][i] = count;
                count++;
            }
            top++;
            for (int i = top; i <= bottom; ++i) {
                mat[i][right] = count;
                count++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    mat[bottom][i] = count;
                    count++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    mat[i][left] = count;
                    count++;
                }
                left++;
            }
        }

        return mat;
    }
}