package com.svshayt.problems;

import java.util.Stack;

/**
 * 234. Palindrome Linked List
 * Easy
 * 13.4K
 * 740
 * Companies
 * Given the head of a singly linked list, return true if it is a
 * palindrome
 * or false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,2,2,1]
 * Output: true
 * Example 2:
 * <p>
 * <p>
 * Input: head = [1,2]
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [1, 105].
 * 0 <= Node.val <= 9
 * <p>
 * <p>
 * Follow up: Could you do it in O(n) time and O(1) space?
 * Accepted
 * 1.4M
 * Submissions
 * 2.8M
 * Acceptance Rate
 * 50.1%
 * Seen this question in a real interview before?
 * 1/4
 * Yes
 * No
 * Discussion (69)
 * Similar Questions
 * Related Topics
 * Linked List
 * Two Pointers
 * Stack
 * Recursion
 */
public class Id234PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode middle = middleNode(head);
        ListNode reverse = reverseNode(middle.next);
        return isEqual(head, reverse);
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) { // if instead while beats 100%
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseNode(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isEqual(ListNode n1, ListNode n2) {
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }

        return true;
    }

    public boolean isPalindromeFast(ListNode head) {
        ListNode sp = head;
        ListNode fp = head;
        if (head.next == null)
            return true;
        while (fp.next != null) {
            if (fp.next.next == null) {
                break;
            }
            sp = sp.next;
            fp = fp.next.next;
        }
        ListNode prev = null;
        ListNode current = sp.next;
        ListNode next = current;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        sp.next = prev;
        sp = sp.next;
        fp = head;
        while (sp.val == fp.val) {
            if (sp.next == null)
                return true;
            sp = sp.next;
            fp = fp.next;
        }
        return false;
    }

    public boolean isPalindrome11(ListNode head) { // slow Runtime 5ms
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode prev = null;
        if (fast == null) return true;
        while (fast != null) {
            ListNode listNode = new ListNode(slow.val, prev);
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            prev = listNode;
        }
        slow = slow.next;
        while (slow != null) {
//            System.out.println(prev.val + " - " + slow.val);
            if (prev.val != slow.val) return false;
            slow = slow.next;
            prev = prev.next;
        }
        return true;
    }

    public ListNode reverseNode2(ListNode head) {
        ListNode node = head;
        ListNode prev = null;
        while (node != null) {
            ListNode curr = new ListNode(node.val, prev);
            prev = curr;
            node = node.next;
        }
        return prev;
    }

    public boolean isPalindrome3(ListNode head) { // slow Runtime 34 ms
        ListNode headCopy = head;
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        while (headCopy != null) {
            if (headCopy.val != stack.pop()) return false;
            headCopy = headCopy.next;
        }
        return true;
    }

    public boolean isPalindrome2(ListNode head) { //slow Runtime 7 ms
        ListNode headCopy = head;
        ListNode prev = null;
        while (head != null) {
            ListNode listNode = new ListNode(head.val, prev);
            head = head.next;
            prev = listNode;
        }

        while (headCopy != null) {
            if (headCopy.val != prev.val) return false;
            headCopy = headCopy.next;
            prev = prev.next;
        }
        return true;
    }

    static void printList(ListNode head) {
        System.out.println("--------");
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
                new ListNode(3, new ListNode(2, new ListNode(1)))))));
        System.out.println(new Id234PalindromeLinkedList().isPalindrome(listNode));
        ListNode listNode2 = new ListNode(1, new ListNode(2, new ListNode(1)));
        System.out.println(new Id234PalindromeLinkedList().isPalindrome(listNode2));
    }
}
