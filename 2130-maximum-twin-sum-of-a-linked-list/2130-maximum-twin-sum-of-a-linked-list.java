/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        slow=reverse(slow);
        int max=0;
        while(slow!=null){
            if(slow.val+head.val>max){
                max=slow.val+head.val;
            }
            slow=slow.next;
            head=head.next;
        }
        return max;
    }
    public ListNode reverse(ListNode temp){
        ListNode prev=null;
        ListNode curr=temp;
        ListNode aft;
        while(curr!=null){
            aft=curr.next;
            curr.next=prev;
            prev=curr;
            curr=aft;
        }
        return prev;
    }
}