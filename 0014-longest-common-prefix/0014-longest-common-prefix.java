class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i=0;
        boolean flag=false;

        while(i<strs[0].length()){
            char c = strs[0].charAt(i);
            for(String str: strs){
                if(i>=str.length() || str.charAt(i)!=c){
                    flag = true;
                    break;
                }
            }
            if(flag) break;
            i++;
        }

        return strs[0].length()<i ? "" : strs[0].substring(0, i);
    }
}