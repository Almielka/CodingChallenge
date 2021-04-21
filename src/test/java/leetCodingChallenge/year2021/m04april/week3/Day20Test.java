package leetCodingChallenge.year2021.m04april.week3;

import leetCode.shared.NodeChildren;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class Day20Test {

    private Day20 day;

    @BeforeEach
    void setUp() {
        day = new Day20();
    }

    @Test
    void testPreorder() {
        // Input: root = [1,null,3,2,4,null,5,6]
        // Output: [1,3,5,6,2,4]
        List<NodeChildren> list = new ArrayList<>();
        List<NodeChildren> sublist = new ArrayList<>();
        list.add(new NodeChildren(3, sublist));
        sublist.add(new NodeChildren(5));
        sublist.add(new NodeChildren(6));
        list.add(new NodeChildren(2));
        list.add(new NodeChildren(4));
        NodeChildren root = new NodeChildren(1, list);
        List<Integer> result = new ArrayList(Arrays.asList(1, 3, 5, 6, 2, 4));
        assertThat(day.preorder(root), is(result));
    }

}