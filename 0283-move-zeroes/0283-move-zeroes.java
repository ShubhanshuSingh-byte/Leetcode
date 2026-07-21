class Solution {
    public void moveZeroes(int[] nums) {
        int zeros=0;
        while(zeros<nums.length){
            while(zeros<nums.length && nums[zeros]!=0)zeros++;
            int ones = zeros+1;
            while(ones<nums.length && nums[ones]==0) ones++;
            swap(nums, ones, zeros);
            zeros++;
        }
    }

    public void swap(int[] nums, int index_a, int index_b){
        if(index_a>=nums.length || index_b>=nums.length) return;
        int temp = nums[index_b];
        nums[index_b] = nums[index_a];
        nums[index_a] = temp;
    }
}