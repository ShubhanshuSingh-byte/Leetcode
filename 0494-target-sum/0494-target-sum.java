class Solution {
    int counter=0;
    public int findTargetSumWays(int[] nums, int target) {
        bt(0, 0, nums, target);
        return counter;
    }

    private void bt(int index, int sum, int[] nums, int target){
        if(index==nums.length)
        {   
            if(sum==target)
                counter++;
            return;
        }
        int n = nums[index];
        bt(index+1, sum-n, nums, target);
        bt(index+1, sum+n, nums, target);
    }
}