/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
-Initialize result number to be equal to head value: num = head.val. This operation is safe because the list is guaranteed to be non-empty.

-Parse linked list starting from the head: while head.next:

-The current value is head.next.val. Update the result by shifting it by one to the left and adding the current value using logical OR: num = (num << 1) | head.next.val.

-Return num.
 
 
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int num = head.val;
        while (head.next != null) {
            num = (num << 1) | head.next.val;
            head = head.next;    
        }
        return num;
    }
}
