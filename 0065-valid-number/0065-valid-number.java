class Solution {
    public boolean isNumber(String s) {
        boolean digit = false;
        boolean e = false;
        boolean dot = false;
        int sign=0;


        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                digit = true;
            }

            else if(c=='+' || c=='-'){
                if(sign==2){
                    return false;
                }
                else if(i>0 && (s.charAt(i-1)!='e' && s.charAt(i-1)!='E')){
                    return false;
                }

                else if(i==s.length()-1){
                    return false;
                }
                sign++;
            }

            else if(c=='.'){
                if(dot || e){
                    return false;
                }
                if(i==s.length()-1 && !digit){
                    return false;
                }
                dot = true;
            }

            else if(c=='e' || c=='E'){
                if(e || !digit || i==s.length()-1){
                    return false;
                }
                e =true;
            }

            else{
                return false;
            }
        }
        return true;
    }
}