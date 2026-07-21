class Solution {
    public int compress(char[] chars) {
        int end = 0;
        int digit = 0;
        int c =0;

        while (c<chars.length){
            while(end<chars.length && chars[end]==chars[c]){
                end++;
            }
            int count = end-c;
            chars[digit++] = chars[c];
            if(count>1) {
                String s = String.valueOf(count);
                for (int i = 0; i < s.length(); i++) {
                    chars[digit++] = s.charAt(i);
                }
            }

            c =end;
        }
        return digit;
    }
}