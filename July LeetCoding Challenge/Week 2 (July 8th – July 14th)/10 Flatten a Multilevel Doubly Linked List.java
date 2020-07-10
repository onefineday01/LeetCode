/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
class Solution {
    Node newhead;
    public Node flatten(Node head) {
        newhead = null;
        doit(head);
        newhead = head;
        while(newhead != null){
            newhead.child = null;
            newhead = newhead.next;
        }
        return head;
    }
    void doit(Node head){
        Node mynext = null;
        while(head != null){
            if(newhead == null)
                newhead = head;
            else{
                newhead.next = head;
                head.prev = newhead;
                newhead = head;
            }  
            if(head.child != null){
                mynext = head.next;
                doit(head.child);
                head = mynext;
            }
            else
                head = head.next;
        }
    }
}