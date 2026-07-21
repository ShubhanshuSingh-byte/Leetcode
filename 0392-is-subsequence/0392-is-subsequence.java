class Solution {
    public boolean isSubsequence(String s, String t) {
        int slen=0;
        int tlen=0;

        while(slen<s.length() && tlen<t.length()){
            if(t.charAt(tlen)==s.charAt(slen)){
                tlen++;
                slen++;
            }
            else{
                tlen++;
            }
        }
        return slen==s.length();
    }
}