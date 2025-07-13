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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer>al=new HashSet<>();
        return dfs(root,al,k);
    }
    public boolean dfs(TreeNode node,HashSet<Integer>al,int k){
        if(node==null){
            return false;
        }
        if(al.contains(k-node.val)){
            return true;
        }
        al.add(node.val);
        return dfs(node.left,al,k)||dfs(node.right,al,k);
    }
}