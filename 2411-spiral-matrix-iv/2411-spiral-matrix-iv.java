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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int [][] res  = new int[m][n];
        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                res[i][j] = -1;
            }
        }
        ListNode node = head;
        int left = 0, right = n-1, top = 0, bottom = m-1;
        int hohorizontalOperator = 1, verticleOperator = 1;
        boolean iterateI = false, iterateJ = true;
        while(node != null){
            for( int j = left; j <= right && node != null ; j++){
                res[top][j] = node.val;
                node = node.next;
            }
            top += 1;
            for( int i = top; i <= bottom && node != null; i++){
                res[i][right] = node.val;
                node = node.next;
            }
            right -=1;

            for(int j = right; j>=left && node != null; j--){
                res[bottom][j] = node.val;
                node = node.next;
            }
            bottom -= 1;

            for(int i = bottom; i>=top && node!=null; i--){
                res[i][left] = node.val;
                node = node.next;
            }
            left += 1;

        }
        return res;
    }
}