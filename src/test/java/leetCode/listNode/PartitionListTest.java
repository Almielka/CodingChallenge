package leetCode.listNode;

import leetCode.shared.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class PartitionListTest {

    private PartitionList day;

    @BeforeEach
    void setUp() {
        day = new PartitionList();
    }

    @Test
    void testPartition() {
        // Input: head = [1,4,3,2,5,2], x = 3
        // Output: [1,2,2,4,3,5]
        ListNode head = new ListNode(1, new ListNode(4, new ListNode(3,
                new ListNode(2, new ListNode(5, new ListNode(2))))));
        ListNode result = new ListNode(1, new ListNode(2, new ListNode(2,
                new ListNode(4, new ListNode(3, new ListNode(5))))));
        assertThat(day.partition(head, 3), is(equalTo(result)));
    }

    @Test
    void testPartition2() {
        // Input: head = [2,1], x = 2
        // Output: [1,2]
        ListNode head = new ListNode(2, new ListNode(1));
        ListNode result = new ListNode(1, new ListNode(2));
        assertThat(day.partition(head, 2), is(equalTo(result)));
    }

}