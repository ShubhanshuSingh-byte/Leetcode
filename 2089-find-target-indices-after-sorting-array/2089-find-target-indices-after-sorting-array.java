class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0;
        int index=0;

        for(int i: nums){
            if(i<target){
                index++;
            }
            if(i==target){
                count++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<count; i++){
            ans.add(index);
            index++;
        }

        return ans;
    }
}