/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode pf=head;
        ListNode cr=head;
        while(pf!=null && pf.next!=null){  //很多博客在这里加上了cr!=null，经验证可不用加，只要保证快指针pf没有越界就可以了。
            cr=cr.next;
            pf=pf.next.next;
            if(pf==cr){                   //切不可用pf.val==cr.val作为条件，因为当pf=pf.next.next之后，pf很可能是null，此时无法返回val
                return true;
            } 
        }
        return false;
    }
}
