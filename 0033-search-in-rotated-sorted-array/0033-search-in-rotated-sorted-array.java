class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right = nums.length-1;

        return bs(nums, target, left, right);
    }

    private int bs(int[] nums, int target, int left, int right){
        int m = (right-left)/2 + left;

        if(left>right) return -1;

        if(nums[m]==target) return m;

        if(nums[left]<=nums[m]){
            if(target>=nums[left] && target<=nums[m]){
                return bs(nums, target, left, m-1);
            }

            else{
                return bs(nums, target, m+1, right);
            }
        }

        else{
            if(target>=nums[m+1] && target<=nums[right]){
                return bs(nums, target, m+1, right);
            }

            else{
                return bs(nums, target, left, m-1);
            }
        }
    }
}