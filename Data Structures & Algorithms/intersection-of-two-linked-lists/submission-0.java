/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ListNode p2=headA;
     ListNode p1=headB;
     while(p2!=p1)
     {
        p1=(p1==null)? headA : p1.next; 
        p2=(p2==null)? headB : p2.next;  }
        return p1;  
    }
}