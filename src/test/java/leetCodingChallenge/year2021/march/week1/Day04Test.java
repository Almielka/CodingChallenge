package leetCodingChallenge.year2021.march.week1;

import leetCode.shared.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day04Test {

    private Day04 day;

    @BeforeEach
    void setUp() {
        day = new Day04();
    }

    @Test
    void testGetIntersectionNode() {
        // Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
        // Output: Reference of the node with value = 8
        // Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
        // From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5].
        // There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
        ListNode tail = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode headA = new ListNode(4, new ListNode(1, tail));
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, tail)));
        assertThat(day.getIntersectionNode(headA, headB), is(equalTo(tail)));
    }

    @Test
    void testGetIntersectionNode2() {
        // Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
        // Output: Reference of the node with value = 2
        // Input Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
        // From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4].
        // There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
        ListNode tail = new ListNode(2, new ListNode(4));
        ListNode headA = new ListNode(1, new ListNode(9, new ListNode(1, tail)));
        ListNode headB = new ListNode(3, tail);
        assertThat(day.getIntersectionNode(headA, headB), is(equalTo(tail)));
    }


    @Test
    void testGetIntersectionNode3() {
        // Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
        // Output: null
        ListNode headA = new ListNode(2, new ListNode(6, new ListNode(4)));
        ListNode headB = new ListNode(1, new ListNode(5));
        assertThat(day.getIntersectionNode(headA, headB), is(equalTo(null)));
    }

}