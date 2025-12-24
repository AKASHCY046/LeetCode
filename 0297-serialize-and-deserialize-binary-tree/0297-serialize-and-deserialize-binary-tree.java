/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder st=new StringBuilder();
         find(root,st);
        return st.toString();
    }
    public void find(TreeNode root,StringBuilder st){
        if(root==null){
            st.append("null ");
            return;
        }
        st.append(Integer.toString(root.val)+" ");
        find(root.left,st);
        find(root.right,st);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String ans[]=data.trim().split(" ");
        List<String> al = new ArrayList<>(Arrays.asList(ans));
        return find1(al);
    }
    public TreeNode find1(List<String>al){
        String val=al.remove(0);
        if(val.charAt(0)=='n'){
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(val));
        root.left=find1(al);
        root.right=find1(al);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));