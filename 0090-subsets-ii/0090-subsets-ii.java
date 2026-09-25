class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        list = new ArrayList<>();
        Arrays.sort(nums);
        dfs(0, nums, new ArrayList<>());
        return list;
    }

    public void dfs(int index, int[] nums, List<Integer> ans){
        if(index==nums.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[index]);
        dfs(index+1, nums, ans);
        ans.remove(ans.size()-1);

        while(index+1<nums.length && nums[index]==nums[index+1]){
            index +=1;
        }
        dfs(index+1, nums, ans);
    }
}