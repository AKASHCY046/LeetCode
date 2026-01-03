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
        Queue<TreeNode>qe=new LinkedList<>();
        HashSet<Integer>hs=new HashSet<>();
        qe.add(root);
        while(!qe.isEmpty()){
            int n=qe.size();
            for(int i=0;i<n;i++){
                TreeNode node=qe.poll();
                if(hs.contains(k-node.val)){
                    return true;
                }
                hs.add(node.val);
                if(node.left!=null){
                    qe.add(node.left);
                }
                if(node.right!=null){
                    qe.add(node.right);
                }
            }
        }
        return false;
    }
}