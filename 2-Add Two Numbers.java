/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cr1=l1;
        ListNode cr2=l2;
        int count=0;
        ListNode head=new ListNode(count);
        ListNode cr3=head;
        int sum=0;
        int carry=0;
        while(cr1!=null || cr2!=null ){
            int v1= cr1==null?0:cr1.val;
            int v2= cr2==null?0:cr2.val;
            sum=v1+v2+count;
            count=sum/10;
            carry=sum%10;
            ListNode tmp=new ListNode(carry);
            cr3.next=tmp;
            cr3=cr3.next;
            cr1=cr1==null?null:cr1.next;
            cr2=cr2==null?null:cr2.next;
            }
 //卡主的关键地方，一定要解决最后一个节点的next问题，否则会多出来一个值为0的结点
        if(count!=0)                                  
            cr3.next=new ListNode(count);
   //通过上面这个if语句，考虑了最后一个结点的next点，虽然没有else，但默认不满足该if条件的化，cr3就没有next点了。
        return head.next;
    }
}
