class Solution {
    static List<String> res;

    public static List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        bt(0, 0, n,sb);
        return res;
    }

    public static void bt(int open, int close, int n, StringBuilder s){
        if(open==close && open==n)
        {
            res.add(s.toString());
            return;
        }

        if(open<n){
            s.append('(');
            bt(open+1, close, n, s);
            s.deleteCharAt(s.length()-1);
        }

        if(close<open){
            s.append(')');
            bt(open, close+1, n, s);
            s.deleteCharAt(s.length()-1);
        }
    }
}