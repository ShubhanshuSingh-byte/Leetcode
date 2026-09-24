class Solution {
    public int smallestIndex(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(i == getval(nums[i])){
                return i;
            }
        }
        return -1;
    }

    public int getval(int num){
        int sum=0;
        while(num>0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }
}