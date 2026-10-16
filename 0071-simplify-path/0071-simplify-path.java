class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] p = path.split("/");

        for(String s: p){
            if(s.isEmpty() || s.equals(".")){
                continue;
            }

            if(s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(s);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (String dir : st) {
            sb.append("/").append(dir);
        }

        return sb.length() == 0 ? "/" : sb.toString();
        
    }
}