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
        if(root==null){
            return false;
        }
        Queue<TreeNode>qe=new LinkedList<>();
        ArrayList<Integer>al=new ArrayList<>();
        qe.add(root);
        al.add(root.val);
        while(!qe.isEmpty()){
            int n=qe.size();
            for(int i=0;i<n;i++){
            TreeNode temp=qe.remove();
            if(temp.left!=null){
                qe.add(temp.left);
                al.add(temp.left.val);
            }
            if(temp.right!=null){
                qe.add(temp.right);
                al.add(temp.right.val);
            }
            }
        }
        for(int i=0;i<al.size();i++){
            if(al.contains(k-al.get(i))){
                if(al.get(i)!=k-al.get(i))
                return true;
            }
        }
        return false;
    }
}