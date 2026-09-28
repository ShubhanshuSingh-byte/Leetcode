class Solution {
    public int maxDepth(String s) {
        int cu=0;
        int m=0;

        for(char c: s.toCharArray()){
            if(c=='('){
                cu++;
            }
            else if(c==')'){
                cu--;
            }

            m = Math.max(cu, m);
        }

        return m;
    }
}