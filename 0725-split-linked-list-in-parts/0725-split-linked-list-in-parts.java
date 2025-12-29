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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        int rem = (n % k);
        int quo = (n / k);
        ListNode arr[] = new ListNode[k];
        temp = head;
        for (int i = 0; i < k; i++) {
            if (temp == null) {
                arr[i] = null;
                continue;
            }
            arr[i] = temp;
            int len = quo + ((rem > 0) ? 1 : 0);
            if (rem > 0)
                rem--;
            for (int j = 1; j < len; j++) {
                temp = temp.next;
            }
            ListNode a = temp.next;
            temp.next = null;
            temp = a;
        }
        return arr;
    }
}