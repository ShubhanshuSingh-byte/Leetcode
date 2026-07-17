class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        bt(0, target, candidates, res, new ArrayList<>());
        return res;
    }

    public void bt(int index, int target, int[] arr, List<List<Integer>> res, List<Integer> list){
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=index; i<arr.length; i++){
            if(i>index && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>target) break;

            list.add(arr[i]);
            bt(i+1, target-arr[i], arr, res, list);
            list.removeLast();
        }
    }
}