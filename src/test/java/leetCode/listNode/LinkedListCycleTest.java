package leetCode.listNode;


import leetCode.shared.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class LinkedListCycleTest {

    private LinkedListCycle day;

    @BeforeEach
    void setUp() {
        day = new LinkedListCycle();
    }

    @Test
    void testHasCycle() {
        ListNode head = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        head.next = listNode2;
        ListNode listNode3 = new ListNode(0);
        listNode2.next = listNode3;
        ListNode listNode4 = new ListNode(-4);
        listNode3.next = listNode4;
        listNode4.next = listNode2;
        assertThat(day.hasCycle(head), is(equalTo(true)));
    }

    @Test
    void testHasCycle2() {
        ListNode head = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        head.next = listNode2;
        listNode2.next = head;
        assertThat(day.hasCycle(head), is(equalTo(true)));
    }

    @Test
    void testHasCycle3() {
        ListNode head = new ListNode(1);
        assertThat(day.hasCycle(head), is(equalTo(false)));
    }

}