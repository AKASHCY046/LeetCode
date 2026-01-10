/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Node>qe=new LinkedList<>();
        qe.add(root);

        while(!qe.isEmpty()){
            int n=qe.size();
            List<Integer>al=new ArrayList<>();
            for(int i=0;i<n;i++){
                Node temp=qe.poll();
                al.add(temp.val);
                for(Node x:temp.children){
                    qe.add(x);
                }
            }
            ans.add(al);
        }
        return ans;
    }
}