class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        bfs(nums, new ArrayList<>(), ans);
        return ans;
    }

    private void bfs(int[] nums, List<Integer> curr, List<List<Integer>> ans){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i: nums){
            if(curr.contains(i)){
                continue;
            }
            curr.add(i);
            bfs(nums, curr, ans);
            curr.removeLast();
        }

    }
}