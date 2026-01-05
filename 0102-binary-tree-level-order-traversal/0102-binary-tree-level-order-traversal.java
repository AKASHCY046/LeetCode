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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>li=new ArrayList<>();
        if(root==null) return li;
        Queue<TreeNode>st=new LinkedList<>();
        st.add(root);
        while(!st.isEmpty()){
            int n=st.size();
            List<Integer>al=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode temp=st.poll();
                al.add(temp.val);
                if(temp.left!=null){
                    st.add(temp.left);
                }
                if(temp.right!=null){
                    st.add(temp.right);
                }
            }
            li.add(al);
        }
        return li;
    }
}