package leetCode.mediumAlgorithms.listNode;

import leetCode.shared.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class AddTwoNumbersTest {

    @Test
    void testAddTwoNumbers(){
//        Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = new ListNode(7, new ListNode(0, new ListNode(8)));
        AddTwoNumbers solution = new AddTwoNumbers();
        assertThat(solution.addTwoNumbers(l1, l2), is(equalTo(result)));
    }

}