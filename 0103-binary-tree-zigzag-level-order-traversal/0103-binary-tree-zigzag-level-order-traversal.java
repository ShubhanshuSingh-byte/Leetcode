/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<TreeNode> q = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int flag = 0;

        if(root==null) return ans;

        q.add(root);    

        List<Integer> res;
        while (!q.isEmpty()) {
            res = new ArrayList<>();
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode curr = q.removeFirst();
                res.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            if(flag==1){
                ans.add(res.reversed());
                flag=0;
            }
            else{
                ans.add(res);
                flag=1;
            }
        }
        return ans;
    }
}