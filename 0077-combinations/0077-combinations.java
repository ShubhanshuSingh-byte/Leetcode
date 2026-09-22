class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        c(1, n, k, ans, res);
        return res;
    }

    private void c(int start, int n, int k, List<Integer> ans, List<List<Integer>> res){
        if(ans.size()==k) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int num = start; num<=n; num++) {
            ans.add(num);
            c(num+1, n, k, ans, res);
            ans.remove(ans.size()-1);
        }
    }
}