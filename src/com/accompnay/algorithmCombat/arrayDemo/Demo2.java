package com.accompnay.algorithmCombat.arrayDemo;

/**
 * @author Accompany
 * Date:2020/1/16
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 *  
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo2 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode myHead = new ListNode(-1);
        myHead.next = head;
        ListNode cur = myHead;
        while (cur.next!=null&&cur.next.next!=null){
            ListNode nextNode =cur.next;
            ListNode oneNode = cur.next.next;
            ListNode twoNode = cur.next.next.next;
            cur.next = oneNode;
            nextNode.next = twoNode;
            oneNode.next = nextNode;
            cur = nextNode;
        }
        return myHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode node = swapPairs(head);
        System.out.println(node);
    }
}
