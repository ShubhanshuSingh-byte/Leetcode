class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        for(int i=0; i<m; i++){
            StringBuilder sb = new StringBuilder();
            if(i==0){
                int j=0;
                while(j<n){
                    sb.append('.');
                    j++;
                }
            }
            else{
                int j=0;
                while(j<n-1){
                    sb.append('#');
                    j++;
                }
                sb.append('.');
            }
            ans[i] = sb.toString();
        }

        return ans;
    }
}