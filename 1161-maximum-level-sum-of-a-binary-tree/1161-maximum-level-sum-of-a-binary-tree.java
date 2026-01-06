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
    public int maxLevelSum(TreeNode root) {
        int max=Integer.MIN_VALUE;
        int lvl=-1;
        int x=0;
        Queue<TreeNode>qe=new LinkedList<>();
        qe.add(root);
        while(!qe.isEmpty()){
            x++;
            int n=qe.size();
            int sum=0;
            for(int i=0;i<n;i++){
                TreeNode temp=qe.poll();
                sum+=temp.val;
                if(temp.left!=null){
                    qe.add(temp.left);
                }
                if(temp.right!=null){
                    qe.add(temp.right);
                }
            }
            if(max<sum){
                lvl=x;
                max=sum;
            }
        }
        return lvl;
    }
}