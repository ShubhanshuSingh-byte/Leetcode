class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int covered = 0;
        int lastIndex = 0;

        if(nums.length==1) return 0;

        for (int i = 0; i < nums.length; i++) {
            covered = Math.max(covered, i+nums[i]);

            if(i==lastIndex){
                lastIndex=covered;
                jumps++;

                if(covered>=nums.length-1) return jumps;

            }
        }
        return jumps;
    }
}