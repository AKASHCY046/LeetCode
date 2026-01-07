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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer>li=new ArrayList<>();
        Queue<TreeNode>qe=new LinkedList<>();
        qe.add(root);
        while(!qe.isEmpty()){
            int n=qe.size();
            for(int i=0;i<n;i++){
                TreeNode node=qe.poll();
                if(i==n-1){
                    li.add(node.val);
                }
                if(node.left!=null){
                    qe.add(node.left);
                }
                if(node.right!=null){
                    qe.add(node.right);
                }
            }
        }
        return li;
    }
}