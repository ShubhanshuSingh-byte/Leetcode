class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;

        int i=0;

        while(i<n){
            int curr = nums[i]-1;
            
            if(nums[i]>0 && nums[i]<=n && nums[curr]!=nums[i]){
                int temp = nums[curr];
                nums[curr] = nums[i];
                nums[i] =temp;
            }

            else{
                i++;
            }
            
        }

        for(i=0; i<n; i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }

        return n+1;
    }
}