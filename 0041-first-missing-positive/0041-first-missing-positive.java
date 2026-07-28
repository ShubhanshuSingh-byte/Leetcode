class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int[] seem = new int[n+1];

        for(int i: nums){
            if(i>0 && i<=n){
                seem[i] = 1;
            }
        }

        for(int i=1; i<seem.length; i++){
            if(seem[i]==0){
                return i;
            }
        }

        return n+1;
    }
}