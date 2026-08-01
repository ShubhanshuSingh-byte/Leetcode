class Solution {
    public boolean predictTheWinner(int[] nums) {
        return dfs(nums, 0, 0, 0, nums.length-1, true);
    }

    public boolean dfs(int[] nums, int p1, int p2, int l, int r, boolean chance){
        if(l>r) return p1>=p2;

        if(chance){
            return dfs(nums, p1+nums[l], p2, l+1, r, false)
                || dfs(nums, p1+nums[r], p2, l, r-1, false);
        }
        else{
            return dfs(nums, p1, p2+nums[l], l+1, r, true)
                && dfs(nums, p1, p2+nums[r], l, r-1, true);
        }
    }
}