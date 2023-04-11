package com.svshayt.problems.linked_list_math_recursion;

import java.util.ArrayList;
import java.util.Collections;

public class Id2AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rNode = new ListNode(0);
        ListNode dummy = rNode;
        int c = 0;
        while (c != 0 || l1 != null || l2 != null) {
            c = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + c;

            rNode.next = new ListNode(c % 10);
            rNode = rNode.next;

            c /= 10;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        return dummy.next;
    }

    int carry = 0;

    public ListNode addTwoNumbers11(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val + carry;
        carry = sum / 10;

        ListNode rNode = new ListNode(sum % 10);

        if (l1.next == null && l2.next == null) {
            if (carry > 0) {
                rNode.next = new ListNode(carry);
            }
        } else {
            l1 = l1.next == null ? new ListNode(0) : l1.next;
            l2 = l2.next == null ? new ListNode(0) : l2.next;

            rNode.next = addTwoNumbers11(l1, l2);
        }

        return rNode;
    }

    private static final ListNode ZERO = new ListNode(0);

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        return recursiveAdd(l1, l2, 0);
    }

    private ListNode recursiveAdd(ListNode a, ListNode b, int carry) {
        int sum = a.val + b.val + carry;
        int newCarry = sum / 10;

        ListNode rNode = new ListNode(sum % 10);

        if (a.next == null && b.next == null) {
            if (newCarry > 0) {
                rNode.next = new ListNode(newCarry);
            }
        } else {
            rNode.next = recursiveAdd(
                    a.next == null ? ZERO : a.next,
                    b.next == null ? ZERO : b.next,
                    newCarry
            );
        }
        return rNode;
    }

    public ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        var list1 = new ArrayList<Integer>();
        var list2 = new ArrayList<Integer>();
        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }

        var res = new ArrayList<Integer>();
        int maxSize = Math.max(list1.size(), list2.size());

        int index = 0;
        int prev = 0;

        while (index < maxSize) {
            int l1Num = 0;
            int l2Num = 0;
            if (index < list1.size()) {
                l1Num = list1.get(index);
            }
            if (index < list2.size()) {
                l2Num = list2.get(index);
            }

            int r = (l1Num + l2Num + prev) % 10;
            prev = (l1Num + l2Num + prev) / 10;
            res.add(r);
            index++;
        }
        if (prev > 0) res.add(1);
        Collections.reverse(res);
        ListNode prevNode = null;
        for (int num : res) {
            var head = new ListNode(num, prevNode);
            prevNode = head;
        }
        return prevNode;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
