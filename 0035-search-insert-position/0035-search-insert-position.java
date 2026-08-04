class Solution {
    public int searchInsert(int[] nums, int target) {

        return bs(nums, target, 0, nums.length-1);
    }

    private int bs(int[] nums, int target, int left, int right){
        int m = (right-left)/2 + left;
        if(target>nums[right]) return nums.length;
        if(target<nums[left]) return left;
        if(nums[m]==target) return m;
        if(left+1==right) return right;
        
        if(nums[m]>target){
            return bs(nums, target, left, m);
        }

        else{
            return bs(nums, target, m+1, right);
        }
    }
}