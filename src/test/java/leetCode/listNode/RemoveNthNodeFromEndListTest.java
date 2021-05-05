package leetCode.listNode;

import leetCode.shared.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class RemoveNthNodeFromEndListTest {

    private RemoveNthNodeFromEndList day;

    @BeforeEach
    void setUp() {
        day = new RemoveNthNodeFromEndList();
    }

    @Test
    void testRemoveNthFromEnd() {
        // Input: head = [1,2,3,4,5], n = 2
        // Output: [1,2,3,5]
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5)))));
        ListNode result = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(5))));
        assertThat(day.removeNthFromEnd(head, 2), is(equalTo(result)));
    }

    @Test
    void testRemoveNthFromEnd2() {
        ListNode head = new ListNode(1);
        assertThat(day.removeNthFromEnd(head, 1), is(equalTo(null)));
    }

    @Test
    void testRemoveNthFromEnd3() {
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode result = new ListNode(1);
        assertThat(day.removeNthFromEnd(head, 1), is(equalTo(result)));
    }

}