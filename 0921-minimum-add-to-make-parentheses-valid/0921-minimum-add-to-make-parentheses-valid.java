class Solution {
    public int minAddToMakeValid(String s) {
        int val=0;
        int ans=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                val++;
            }
            else{
                if(val==0){
                    ans++;
                }
                else{
                    val--;
                }
            }
        }

        return ans+val;
    }
}