/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || (head != null && head.next == null))
            return head;
        ListNode main_even = head.next;
        ListNode main_odd = head;
        ListNode even = main_even;
        ListNode odd = main_odd;
        do{
            ListNode etemp = even;
            ListNode otemp = odd;
            if(odd.next != null){
                odd.next = otemp.next.next;
                odd = odd.next;
            }
            if(even.next != null){
                even.next = etemp.next.next;
                even = even.next;
            } 
        }while(even != null && odd != null);
        head = main_odd;
        ListNode prev = null;
        while(main_odd != null){
            prev = main_odd;
            main_odd = main_odd.next;
        }
        prev.next = main_even;
        
        return head;
        
    }
}