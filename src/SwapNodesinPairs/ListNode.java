package SwapNodesinPairs;

import java.util.List;

/**
 * Created by 95232 on 2017/4/15.
 */
public class ListNode {

    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public ListNode swapPairs(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while(current.next!=null && current.next.next !=null){
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return  dummy.next;
    }
    public ListNode swapPair(ListNode head){
        if((head == null) ||(head.next == null)){
            return head;
        }
        ListNode n = head.next ;
        head.next = swapPair(head.next.next);
        n.next = head ;
        return n;
    }

}
