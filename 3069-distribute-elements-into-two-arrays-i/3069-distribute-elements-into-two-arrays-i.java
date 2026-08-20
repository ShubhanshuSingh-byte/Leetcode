class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int k=2; k<nums.length; k++) {
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)) arr1.add(nums[k]);
            else arr2.add(nums[k]);
        }
        int[] res = new int[nums.length];
        int i=0;
        for(int j: arr1) res[i++]=j;
        for(int j: arr2) res[i++]=j;

        return res;
    }
}