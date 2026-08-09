class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;
        boolean[] can = new boolean[nums.length];
        can[0] = true;

        for(int i=0; i<nums.length; i++){
            if(can[i]){
                if(farthest<i+nums[i]){
                    farthest = i+nums[i];
                    int j=i;
                    while(j<=farthest && j<nums.length){
                        can[j] = true;
                        j++;
                    }
                }
            }
        }

        return can[nums.length-1];
    }
}