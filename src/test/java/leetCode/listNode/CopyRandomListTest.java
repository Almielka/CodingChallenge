package leetCode.listNode;


import leetCode.shared.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.beans.SamePropertyValuesAs.samePropertyValuesAs;

class CopyRandomListTest {

    private CopyRandomList day;

    @BeforeEach
    void setUp() {
        day = new CopyRandomList();
    }

    @Test
    void testHasCycle() {
        Node head = new Node(3);
        Node node2 = new Node(3);
        Node node3 = new Node(3);
        head.next = node2;
        node2.next = node3;
        node2.random = head;
        assertThat(day.copyRandomList(head), is(samePropertyValuesAs(head)));
    }

    @Test
    void testHasCycle2() {
        Node head = new Node(1);
        Node node2 = new Node(2);
        head.next = node2;
        head.random = node2;
        node2.random = node2;
        assertThat(day.copyRandomList(head), is(samePropertyValuesAs(head)));
    }

}