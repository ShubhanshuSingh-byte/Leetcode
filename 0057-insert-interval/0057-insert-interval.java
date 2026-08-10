class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] ans = new int[intervals.length+1][2];
        int j=0, i=0;

        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            ans[j++] = intervals[i++];
        }

        while(i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        ans[j++] = newInterval;

        while(i<intervals.length){
            ans[j++] = intervals[i++];
        }
        return Arrays.copyOf(ans, j);
    }
}