class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int unique = 0;
        
        for(int i=1; i<nums.length;i++)
        {
            if(nums[unique]!=nums[i])
            {
                unique++;
                nums[unique] = nums[i];
            }
        }
        return unique+1;
    }
}