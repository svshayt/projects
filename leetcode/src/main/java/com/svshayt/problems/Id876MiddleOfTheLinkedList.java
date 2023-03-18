package com.svshayt.problems;

/**
 * 876. Middle of the Linked List
 * Easy
 * 9K
 * 262
 * Companies
 * Given the head of a singly linked list, return the middle node of the linked list.
 * <p>
 * If there are two middle nodes, return the second middle node.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 * Example 2:
 * <p>
 * <p>
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [1, 100].
 * 1 <= Node.val <= 100
 * Accepted
 * 1.2M
 * Submissions
 * 1.6M
 * Acceptance Rate
 * 75.5%
 * Seen this question in a real interview before?
 * 1/4
 * Yes
 * No
 * Discussion (45)
 * Similar Questions
 * Related Topics
 * Linked List
 * Two Pointers
 */
public class Id876MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        if (fast == null) return slow;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
        }
        return slow;
    }

    public ListNode middleNode2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode middleNode3(ListNode head) { //slow
        if (head.next == null) {
            return head;
        }
        ListNode pointer = head;
        ListNode result = head;
        int size = 0;
        while(pointer != null) {
            //System.out.println(pointer.val);
            size++;
            pointer = pointer.next;
        }
        pointer = head;
        int middle = size / 2;
        size = 0;
        while(pointer != null) {
            size++;
            if (size >= middle) {
                result = pointer.next;
                break;
            }
            pointer = pointer.next;
        }
        return result;
    }


}
