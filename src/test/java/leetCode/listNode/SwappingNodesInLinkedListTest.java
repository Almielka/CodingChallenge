package leetCode.listNode;

import leetCode.shared.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class SwappingNodesInLinkedListTest {

    private SwappingNodesInLinkedList day;

    @BeforeEach
    void setUp() {
        day = new SwappingNodesInLinkedList();
    }

    @Test
    void testSwapNodes() {
        // Input: head = [1,2,3,4,5], k = 2
        // Output: [1,4,3,2,5]
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5)))));
        assertThat(day.swapNodes(head, 2), is(equalTo(result)));
    }

    @Test
    void testSwapNodes2() {
        // Input: head = [1], k = 1
        // Output: [1]
        ListNode head = new ListNode(1);
        ListNode result = new ListNode(1);
        assertThat(day.swapNodes(head, 1), is(equalTo(result)));
    }

    @Test
    void testSwapNodes3() {
        // Input: head = [1,2], k = 1
        // Output: [2,1]
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode result = new ListNode(2, new ListNode(1));
        assertThat(day.swapNodes(head, 1), is(equalTo(result)));
    }

    @Test
    void testSwapNodes4() {
        // Input: head = [1,2,3], k = 2
        // Output: [1,2,3]
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode result = new ListNode(1, new ListNode(2, new ListNode(3)));
        assertThat(day.swapNodes(head, 2), is(equalTo(result)));
    }

}