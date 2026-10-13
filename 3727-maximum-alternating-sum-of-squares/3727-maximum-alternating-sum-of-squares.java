class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                nums[i] = -1*nums[i];
            }
        }

        Arrays.sort(nums);

        int l=0, r=nums.length-1;
        long sum=0;
        while(l<r){
            sum -= nums[l]*nums[l];
            sum += nums[r]*nums[r];
            r--;
            l++;
        }
        if(nums.length%2!=0){
            sum+=nums[r]*nums[r];
        }

        return sum;
    }
}