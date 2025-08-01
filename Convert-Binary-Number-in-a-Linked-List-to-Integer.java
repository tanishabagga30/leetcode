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
        ListNode temp=head;
        int len=0;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        int dec=0;
        ListNode temp1=head;
        while(len>-1){
            dec=dec+(int) (Math.pow(2, len)*temp1.val);
            temp1=temp1.next;
            len--;
        }

        return dec;
    }
}