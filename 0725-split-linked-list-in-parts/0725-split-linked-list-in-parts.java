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
        int len = 0;
        ListNode node = head;

        while(node != null){
            len += 1;
            node = node.next;
        }

        double lenOfEachPart = Math.ceil((double)len/k);
        ListNode[] res = new ListNode[k];
        if(head == null) return res;
        res[0] = head;
        int index = 1;
        ListNode prev = null;
        prev = head;
        head = head.next;
        int prevIndex = 0;
        for(int i = 1; i<len; i++){
            if((i-prevIndex) % lenOfEachPart == 0){
                res[index] = head;
                if(prev != null) prev.next = null;
                index+=1;
                if(index == k) break;
                lenOfEachPart = Math.ceil((double)(len-i)/(k-index+1));
                prevIndex = i;
            }
            prev = head;
            head = head != null? head.next:null;
             
        }
        return res;
    }
}