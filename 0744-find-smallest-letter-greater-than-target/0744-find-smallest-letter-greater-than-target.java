class Solution {
    public char nextGreatestLetter(char[] nums, char target) {
        for(char c: nums){
            if(c>target){
                return c;
            }
        }
        return nums[0];
    }
}