package com.accompnay.algorithmCombat.arrayDemo;

/**
 * @author Accompany
 * Date:2020/1/19
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 * <p>
 * k 是一个正整数，它的值小于或等于链表的长度。
 * <p>
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 * <p>
 * 示例 :
 * <p>
 * 给定这个链表：1->2->3->4->5
 * <p>
 * 当 k = 2 时，应当返回: 2->1->4->3->5
 * <p>
 * 当 k = 3 时，应当返回: 3->2->1->4->5
 * <p>
 * 说明 :
 * <p>
 * 你的算法只能使用常数的额外空间。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class Demo5 {
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

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k<1){
            return head;
        }
        ListNode previous = null;
        ListNode cur = head;
        while (head != null) {
            ListNode next = null;
            for (int i = 0; i < k; i++) {
                next = cur.next;
                cur.next = previous;
                previous = head;
                cur = next;
            }
            head.next = next;
            head = next;

        }
        return null;
    }

    public static void main(String[] args) {

    }


}
