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
    public TreeNode constructFromPrePost(int[] pre, int[] pos) {
        return find(pre,pos);
    }
    public TreeNode find(int pre[],int pos[]){
        if(pre.length==0) return null;

        TreeNode root=new TreeNode(pre[0]);
        if (pre.length == 1) return root;

        int lef=pre[1];

        int ind=-1;
        for(int i=0;i<pos.length;i++){
            if(pos[i]==lef){
                ind=i;
                break;
            }
        }
        root.left=find(Arrays.copyOfRange(pre,1,ind+2),Arrays.copyOfRange(pos,0,ind+1));


        root.right=find(Arrays.copyOfRange(pre,ind+2,pre.length),Arrays.copyOfRange(pos,ind+1,pos.length-1));
        return root;
    }
}