class Solution {
    public String removeOuterParentheses(String s) {
        int co = 0;
        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()) {
            if(c=='('){
                if(co!=0){
                    sb.append(c);
                }
                co++;
            }

            else{
                if(co!=1){
                    sb.append(c);
                }
                co--;
            }
        }

        return sb.toString();
    }
}