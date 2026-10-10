class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[] nums = new int[100001];
        int n = nums1.length;
        int max = 0;
        long k = k1+k2, sum=0;

        for(int i=0; i<n; i++){
            int x = Math.abs(nums1[i]-nums2[i]);
            nums[x]++;
            sum +=x;
            max = Math.max(max,x);
        }

        if(sum<=k) return 0;

        for(int i=max; i>0 && k>0; i--) {
            long move = Math.min(k, nums[i]);
            nums[i] -= move;
            nums[i-1] += move;
            k -= move;
        }

        long ans=0;
        for(int i=0; i<=max; i++){
            ans+= i*i*nums[i];
        }

        return ans;
    }
}