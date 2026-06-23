class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        for(int i=0; i<nums.length -2;i++)
        {
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int a = i+1;
            int b = nums.length-1; 
            while(a<b)
            {
                int sum = nums[a] + nums[b] + nums[i];
                if(sum==0){
                    ans.add(new ArrayList<>(List.of(nums[a], nums[b], nums[i])));
                    while(a<b && nums[a]==nums[a+1]) a++;
                    while(a<b && nums[b]==nums[b-1]) b--;
                    a++;
                    b--;
                }
                else if(sum<0) a++;
                else b--;
           }
        }
        return ans;
    }
}