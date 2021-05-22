package leetCodingChallenge.year2021.m05may.week3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day18Test {

    private Day18 day;

    @BeforeEach
    void setUp() {
        day = new Day18();
    }

    @Test
    void testFindDuplicate() {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        List<String> list1 = Arrays.asList("root/a/1.txt", "root/c/3.txt");
        List<String> list2 = Arrays.asList("root/a/2.txt", "root/c/d/4.txt", "root/4.txt");
        List<List<String>> duplicates = new ArrayList<>();
        duplicates.add(list1);
        duplicates.add(list2);
        assertThat(day.findDuplicate(paths), is(equalTo(duplicates)));
    }

    @Test
    void testFindDuplicate2() {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)"};
        List<String> list1 = Arrays.asList("root/a/1.txt", "root/c/3.txt");
        List<String> list2 = Arrays.asList("root/a/2.txt", "root/c/d/4.txt");
        List<List<String>> duplicates = new ArrayList<>();
        duplicates.add(list1);
        duplicates.add(list2);
        assertThat(day.findDuplicate(paths), is(equalTo(duplicates)));
    }

}