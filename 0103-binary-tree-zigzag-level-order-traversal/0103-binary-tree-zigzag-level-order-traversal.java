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
        List<List<Integer>> li = new ArrayList<>();
        if (root == null)
            return li;
        Queue<TreeNode> qe = new LinkedList<>();
        qe.add(root);
        int lvl = 0;
        while (!qe.isEmpty()) {
            int n = qe.size();
            List<Integer> al = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode temp = qe.poll();
                if (lvl % 2 == 0) {
                    al.add(temp.val);
                } else {
                    al.add(0, temp.val);
                }

                if (temp.left != null)
                    qe.add(temp.left);
                if (temp.right != null)
                    qe.add(temp.right);
            }
            li.add(al);
            lvl++;
        }
        return li;
    }
}