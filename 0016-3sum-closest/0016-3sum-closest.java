class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];

        for(int i=0; i<nums.length -2;i++)
        {
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int a = i+1;
            int b = nums.length-1; 
            while(a<b)
            {
                int sum = nums[a] + nums[b] + nums[i];
                if (Math.abs(target - sum) < Math.abs(target - ans)) {
                    ans = sum;
                }
                if(sum>target) b--;
                else a++;
            }
        }
        return ans;
    }
}