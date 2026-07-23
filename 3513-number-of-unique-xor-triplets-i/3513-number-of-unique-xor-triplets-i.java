class Solution {
    public int uniqueXorTriplets(int[] nums) {
        if(nums.length<=2) return nums.length;
        int n = nums.length;

        int counter = 0;

        while(n>0){
            n/=2;
            counter++;
        }

        return (int)Math.pow(2,counter);
    }
}