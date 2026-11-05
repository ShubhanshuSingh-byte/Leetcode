class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;

        for(int i: arr1){
            boolean y = true;
            for(int j: arr2){
                if(Math.abs(i-j)<=d){
                    y=false;
                    break;
                }
            }
            if(y) ans++;
        }
        return ans;
    }
}