class Solution {
    public int maxProfit(int[] prices) {
        int max = -1;
        int[] arr = new int[prices.length];

        for(int i=prices.length-1; i>=0; i--){
            max = Math.max(max, prices[i]);
            arr[i] = max;
        }

        int ans = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            ans = Math.max(ans, -prices[i] + arr[i]);
        }

        return ans;
    }
}