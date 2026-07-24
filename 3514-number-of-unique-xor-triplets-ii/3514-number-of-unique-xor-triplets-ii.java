class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> triplet = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                set.add(nums[i]^nums[j]);
            }
        }

        for(int i: set){
            for(int num: nums){
                triplet.add(i^num);
            }
        }

        return triplet.size();
    }
}