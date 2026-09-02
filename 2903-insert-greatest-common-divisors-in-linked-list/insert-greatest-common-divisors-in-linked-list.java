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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
       ListNode fast=head.next;
       ListNode slow=head;
       while(fast!=null){
        int gcd=GCD(fast.val,slow.val);
        ListNode temp = new ListNode(gcd);
        slow.next=temp;
        temp.next=fast;
        fast=fast.next;
        slow=slow.next.next;
       }
       return head;
    }
    int GCD(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}