class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr = 0, cnt=1;

        for(int i=1; i<nums.length; i++){
            if(nums[ptr]==nums[i] && cnt<2){
                ptr += 1;
                cnt += 1;
                swap(ptr, i, nums);
            }
            else if(nums[ptr]!=nums[i]){
                ptr += 1;
                cnt = 1;
                swap(ptr, i, nums);
            }
        }

        return ptr+1;
    }

    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}