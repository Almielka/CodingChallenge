package leetCodingChallenge.year2021.february.week1;

import leetCode.shared.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.beans.SamePropertyValuesAs.samePropertyValuesAs;

class Day02Test {

    private Day02 day;

    @BeforeEach
    void setUp() {
        day = new Day02();
    }

    @Test
    void testTrimBST() {
        TreeNode root = new TreeNode(1, new TreeNode(0), new TreeNode(2));
        TreeNode result = new TreeNode(1, null, new TreeNode(2));
        assertThat(day.trimBST(root, 1, 2), is(samePropertyValuesAs(result)));
    }

    @Test
    void testTrimBST2() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(0, null, new TreeNode(2, new TreeNode(1), null));
        root.right = new TreeNode(4);
        TreeNode result = new TreeNode(3, new TreeNode(2, new TreeNode(1), null), null);
        assertThat(day.trimBST(root, 1, 3), is(samePropertyValuesAs(result)));
    }

    @Test
    void testTrimBST3() {
        TreeNode root = new TreeNode(1);
        TreeNode result = new TreeNode(1);
        assertThat(day.trimBST(root, 1, 2), is(samePropertyValuesAs(result)));
    }

    @Test
    void testTrimBST4() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        TreeNode result = new TreeNode(1, null, new TreeNode(2));
        assertThat(day.trimBST(root, 1, 3), is(samePropertyValuesAs(result)));
    }

    @Test
    void testTrimBST5() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        TreeNode result = new TreeNode(2);
        assertThat(day.trimBST(root, 2, 4), is(samePropertyValuesAs(result)));
    }

}