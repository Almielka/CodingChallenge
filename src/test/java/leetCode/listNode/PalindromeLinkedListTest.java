package leetCode.listNode;

import leetCode.shared.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class PalindromeLinkedListTest {

    private PalindromeLinkedList day;

    @BeforeEach
    void setUp() {
        day = new PalindromeLinkedList();
    }

    @Test
    void testIsPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        assertThat(day.isPalindrome(head), is(equalTo(true)));
        assertThat(day.isPalindrome2(head), is(equalTo(true)));
    }

    @Test
    void testIsPalindrome2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        assertThat(day.isPalindrome(head), is(equalTo(false)));
        assertThat(day.isPalindrome2(head), is(equalTo(false)));
    }

    @Test
    void testIsPalindrome3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(1);
        assertThat(day.isPalindrome(head), is(equalTo(true)));
        assertThat(day.isPalindrome2(head), is(equalTo(true)));
    }

}