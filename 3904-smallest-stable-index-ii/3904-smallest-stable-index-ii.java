class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] min = new int[n];
        int minn = Integer.MAX_VALUE;
        int maxx = Integer.MIN_VALUE;

        for(int i=n-1; i>=0; i--){
            minn = Math.min(minn, nums[i]);
            min[i] = minn;
        }

        for(int i=0; i<n; i++){
            maxx = Math.max(maxx, nums[i]);
            if(maxx-min[i]<=k) return i;
        }

        return -1;
    }
}