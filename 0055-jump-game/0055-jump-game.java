class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;
        boolean[] can = new boolean[nums.length];
        can[0] = true;

        for(int i=0; i<nums.length; i++){
            if(can[i]){
                farthest = Math.max(farthest, i+nums[i]);
            }
            if(farthest<nums.length){
                int j=i;
                while(j<=farthest && j<nums.length){
                    can[j] = true;
                    j++;
                }
            }
            else{
                return true;
            }
        }

        return farthest>=nums.length-1;
    }
}