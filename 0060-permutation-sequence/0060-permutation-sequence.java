class Solution {
    public String getPermutation(int n, int k) {
        int[] arr = new int[n];
        boolean[] used = new boolean[n];

        for(int i=1; i<=n; i++){
            arr[i-1] = i;
        }

        StringBuilder sb = new StringBuilder();
        dfs(n, k, arr, used, sb);

        return sb.toString();
    }

    private void dfs(int n, int k, int[] arr, boolean[] used, StringBuilder sb){
        if(n==0) return;

        int f = fact(n);
        int parts = f/n;
        int element = (k-1)/parts;

        int index = -1;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                if (count == element) {
                    index = i;
                    break;
                }
                count++;
            }
        }

        sb.append(arr[index]);
        used[index] = true;

        dfs(n-1, (k-1)%parts+1, arr, used, sb);
    }

    private int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
}