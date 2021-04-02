package leetCodingChallenge.year2021.m03march.week1;

import leetCode.shared.ListNode;

/**
 * @author Anna S. Almielka
 * 04.03.2021
 */

public class Day04 {

    /**
     * Write a program to find the node at which the intersection of two singly linked lists begins.
     *
     * For example, the following two linked lists:
     * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
     * Output: Reference of the node with value = 8
     * Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
     * From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5].
     * There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
     *
     * @param headA a linked list
     * @param headB a linked list
     * @return a node at which the intersection of two singly linked lists begins
     */
    // Runtime: 1 ms
    // Memory Usage: 41.9 MB
    // Time complexity: O(m + n)
    // Space complexity: O(1)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode pA = headA;
        ListNode pB = headB;
        while(pA != pB ){
            // //for the end of first iteration, we just reset the pointer to the head of another linkedList
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }

        return pA;
    }

}
