class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<=nums.length-4;i++)
        {
            if(i!=0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j<=nums.length-3;j++)
            {
                if(j!=i+1 && nums[j]==nums[j-1]) continue;
                int a = j+1;
                int b = nums.length-1;
                while(a<b)
                {
                    long sum = (long)nums[i] + nums[j] + nums[a] + nums[b];
                    if(sum==target){
                        ans.add(new ArrayList<>(List.of(nums[i], nums[j], nums[a], nums[b])));
                        while(a<b && nums[a]==nums[a+1]) a++;
                        while(a<b && nums[b]==nums[b-1]) b--;
                        a++;
                        b--;
                    }
                    else if(sum<target) a++;
                    else b--;
                }
            }
        }
        return ans;
    }
}