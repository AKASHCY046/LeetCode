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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode>qe1=new LinkedList<>();
        qe1.add(p);
        qe1.add(q);
        while(!qe1.isEmpty()){
            TreeNode temp1=qe1.remove();
            TreeNode temp2=qe1.remove();
            if(temp1==null && temp2==null){
                continue;
            }
            if(temp1==null || temp2==null || temp1.val!=temp2.val){
                return false;
            }
            qe1.add(temp1.left);
            qe1.add(temp2.left);
            qe1.add(temp1.right);
            qe1.add(temp2.right);
        }
   
        return true;
    }
}