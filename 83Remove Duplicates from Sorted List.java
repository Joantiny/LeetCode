/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newnode=head;
         
        while(newnode!=null){
        if(newnode.next==null)
            break;
        if(newnode.val!=newnode.next.val){
            newnode=newnode.next;
        }else{
            newnode.next=newnode.next.next;
        
       }
        }
    return head;
    
}
}
//心得：注意最后return的必须是head，而不是newnode，因为newnode指向最后一个节点，而head才是处理完重复节点的最终链表。
