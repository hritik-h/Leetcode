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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> hm = new HashSet<>();
        for(int each: nums){
            hm.add(each);
        }
        System.out.println(hm);
        ListNode node = head;
        ListNode prev = null;
        while(node != null){
            if(hm.contains(node.val)) {
                System.out.println(node.val);
                if(node == head){
                    head = node.next;
                    prev = head;
                } else{
                    prev.next = node.next;
                }
            } else{
                prev = node;
            }
            
            node = node.next;
        }
        return head;
    }
}