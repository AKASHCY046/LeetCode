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
    public int getDecimalValue(ListNode head) {
        Stack<Integer>st=new Stack<>();
        int a=0;
        int i=0;
        ListNode temp=head;
        while(temp!=null){
            st.add(temp.val);
            temp=temp.next;
        }
        while(!st.isEmpty()){
            if(st.pop()!=0){
                a+=Math.pow(2,i);
            }
            i++;
        }
        return a;
    }
}