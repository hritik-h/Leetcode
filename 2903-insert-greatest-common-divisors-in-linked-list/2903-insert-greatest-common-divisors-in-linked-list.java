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
    public int gcd(int a, int b){
        if(a == 0 ) return b;
        if(b == 0) return a;
        if(a == b) return b;
        if(a>b) return gcd(a-b,b);
        return gcd(a,b-a);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null) return head;
        ListNode node = head;
        while(node.next != null){
            ListNode newNode = new ListNode(gcd(node.val,node.next.val));
            newNode.next = node.next;
            node.next = newNode;
            node = newNode.next;
        }
        return head;
    }
}