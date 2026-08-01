class Solution {
    public boolean predictTheWinner(int[] nums) {
        return dfs(nums, 0, nums.length-1, 0, 0, true);
    }

    public boolean dfs(int[] nums, int left, int right, int p1, int p2, boolean chance){
        if(left>right) return p1>=p2;

        if(chance){
            return dfs(nums, left+1, right, p1+nums[left], p2, false)
                || dfs(nums, left, right-1, p1+nums[right], p2, false);
        }

        else{
            return dfs(nums, left+1, right, p1, p2+nums[left], true)
                && dfs(nums, left, right-1, p1, p2+nums[right], true);
        }
    }
}