class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] bool = new boolean[nums.length];
        bt(nums, bool, new ArrayList<>(), ans);
        return ans;
    }

    private void bt(int[] nums, boolean[] bool, List<Integer> curr, List<List<Integer>> ans){
        if(curr.size()==nums.length ){
            if(!ans.contains(curr))
                ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(bool[i])continue;
            curr.add(nums[i]);
            bool[i] = true;
            bt(nums, bool, curr, ans);
            bool[i] = false;
            curr.removeLast();
        }
    }
}