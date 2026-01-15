/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;

        Node curr = head;
        while (curr != null) {
            Node x = new Node(curr.val);
            x.next = curr.next;
            curr.next = x;
            curr = x.next;
        }
        curr = head;
        while (curr != null) {
            curr.next.random = (curr.random != null) ? curr.random.next : null;
            curr = curr.next.next;
        }
        curr = head;
        Node ans = curr.next;
        Node temp = curr.next;
        while (curr != null) {
            curr.next = temp.next;
            curr = curr.next;
            if (curr != null) {
                temp.next = curr.next;
                temp = temp.next;
            }
        }

        return ans;

    }
}
