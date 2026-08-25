class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] b = new int[nums.length];

        for(int i: nums){
            if(i%k==0 && i/k-1<nums.length){
                b[i/k-1]=1;
            }
        }

        int i=0;
        for(i=0; i<nums.length; i++){
            if(b[i]==0) break;
        }

        return (i+1)*k;
    }
}