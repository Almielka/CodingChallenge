package leetCodingChallenge.year2021.m05may;

import leetCode.shared.ListNode;
import leetCode.shared.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class Day06Test {

    private Day06 day;

    @BeforeEach
    void setUp() {
        day = new Day06();
    }

    @Test
    void testSortedListToBST() {
        // Input: head = [-10,-3,0,5,9]
        // Output: [0,-3,9,-10,null,5]
        // Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.
        ListNode head = new ListNode(-10, new ListNode(-3, new ListNode(0,
                new ListNode(5, new ListNode(9)))));
        TreeNode bst = new TreeNode(0, new TreeNode(-3, new TreeNode(-10), null),
                new TreeNode(9, new TreeNode(5), null));
        assertThat(day.sortedListToBST(head), is(bst));
    }

    @Test
    void testSortedListToBST2() {
        ListNode head = new ListNode();
        TreeNode bst = new TreeNode();
        assertThat(day.sortedListToBST(head), is(bst));
    }

    @Test
    void testSortedListToBST3() {
        ListNode head = new ListNode(1, new ListNode(3));
        TreeNode bst = new TreeNode(3, new TreeNode(1), null);
        assertThat(day.sortedListToBST(head), is(bst));
    }

    @Test
    void testSortedListToBST4() {
        ListNode head = new ListNode(0);
        TreeNode bst = new TreeNode(0);
        assertThat(day.sortedListToBST(head), is(bst));
    }

}