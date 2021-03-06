package linked.linked_0408;

public class TestLinked {
}
/*
142. 环形链表 II
给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
说明：不允许修改给定的链表。
 */
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
/*
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slowNode = head;
        ListNode fastNode = head;
        //相遇的节点
        while(fastNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(slowNode == fastNode){
                break;
            }
        }
        if(slowNode != fastNode){
            return null;
        }
        fastNode = head;
        while(fastNode != slowNode){
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }
        return slowNode;
    }
}*/
