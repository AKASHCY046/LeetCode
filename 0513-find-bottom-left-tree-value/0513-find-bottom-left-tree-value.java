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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode>qe=new LinkedList<>();
        qe.add(root);
        int first=0;
        while(!qe.isEmpty()){
            int n=qe.size();
            for(int i=0;i<n;i++){
                TreeNode temp=qe.poll();
                if(i==0){
                    first=temp.val;
                }
                if(temp.left!=null){
                    qe.add(temp.left);
                }
                if(temp.right!=null){
                    qe.add(temp.right);
                }
            }
            if(qe.isEmpty()){
                return first;
            }
        }
        return first;
    }
}