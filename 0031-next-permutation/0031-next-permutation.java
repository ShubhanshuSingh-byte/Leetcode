class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
        }
        
        if(ind==-1){
            reverse(nums, 0, nums.length-1);
            return;
        }

        for(int i=nums.length-1; i>ind; i--){
            if(nums[i]>nums[ind]){
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;

                break;
            }
        }

        reverse(nums, ind+1, nums.length-1);
    }

    private void reverse(int[] nums, int l, int r){
        while(l<r){
            int temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;

            l++;
            r--;
        }
    }
}