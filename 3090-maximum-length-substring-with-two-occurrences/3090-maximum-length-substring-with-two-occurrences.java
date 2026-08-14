class Solution {
    public int maximumLengthSubstring(String s) {
        int start =0;
        int max=-1;
        int[] freq = new int[26];

        for(int end=0; end<s.length(); end++){
            freq[s.charAt(end)-'a']++;

            while(freq[s.charAt(end)-'a']>2){
                freq[s.charAt(start)-'a']--;
                start++;
            }
            max = Math.max(max, end-start+1);
        }
        return max;
    }
}