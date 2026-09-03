class Solution {
    public boolean uniformArray(int[] nums1) {
        int parity = 0;

        if((nums1[0] & 1) == 1) parity = 1;

        boolean t = true;

        for(int i: nums1){
            if((i&1) != parity){
                t=false;
                break;
            }
        }
        if(t) return true;
        int min_even = Integer.MAX_VALUE;
        int min_odd = Integer.MAX_VALUE;

        for(int i=0; i<nums1.length; i++){
            if(nums1[i]%2==0){
                min_even = Math.min(min_even, nums1[i]);
            }
            else{
                min_odd = Math.min(min_odd, nums1[i]);
            }
        }

        return min_odd < min_even;
    }
}