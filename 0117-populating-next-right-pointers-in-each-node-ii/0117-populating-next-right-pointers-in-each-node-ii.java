/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {

    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        Queue<Node>qe=new LinkedList<>();
        qe.add(root);
        while(!qe.isEmpty()){
            int s=qe.size();
            Node prev=null;
            for(int i=0;i<s;i++){
                Node temp=qe.remove();
                 if(i==0){
                    prev=temp;
                }
                if(temp.left!=null)
                qe.add(temp.left);
                if(temp.right!=null)
                qe.add(temp.right);
                if(i!=0){
                    prev.next=temp;
                    prev=temp;
                }
            }
        }   
        return root;
    }
}