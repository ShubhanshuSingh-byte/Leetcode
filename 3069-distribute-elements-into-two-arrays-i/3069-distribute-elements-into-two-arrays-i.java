class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int a1 = 1;
        int a2 = 1;

        for(int i=2; i<nums.length; i++){
            if(arr1[a1-1]>arr2[a2-1]){
                arr1[a1++] = nums[i];
            }
            else{
                arr2[a2++] = nums[i];
            }
        }

        for(int i=0; i<a2; i++){
            arr1[a1++] = arr2[i];
        }

        return arr1;
    }
}