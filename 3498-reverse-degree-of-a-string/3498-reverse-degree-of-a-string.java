class Solution {
    public int reverseDegree(String s) {
        int sum = 0;

        for(int i=0; i<s.length(); i++) {
            int val = (-1)*(i+1)*(s.charAt(i)-'a'-26);
            sum += val;
        }
        return sum;
    }
}