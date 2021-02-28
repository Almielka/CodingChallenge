package leetCodingChallenge.year2021.february.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day22Test {

    private Day22 day;

    @BeforeEach
    void setUp() {
        day = new Day22();
    }

    @Test
    void testFindLongestWord() {
        // s = "abpcplea", d = ["ale","apple","monkey","plea"]
        String[] arr = {"ale","apple","monkey", "plea"};
        List<String> d = Arrays.asList(arr);
        assertThat(day.findLongestWord("abpcplea", d), is(equalTo("apple")));
    }

    @Test
    void testFindLongestWord2() {
        // s = "abpcplea", d = ["a","b","c"]
        String[] arr = {"a","b","c"};
        List<String> d = Arrays.asList(arr);
        assertThat(day.findLongestWord("abpcplea", d), is(equalTo("a")));
    }

    @Test
    void testFindLongestWord3() {
        // s = "bab", d = ["ba","ab","a","b"]
        String[] arr = {"ba","ab","a","b"};
        List<String> d = Arrays.asList(arr);
        assertThat(day.findLongestWord("bab", d), is(equalTo("ab")));
    }

    @Test
    void testFindLongestWord4() {
        // s = "apple", d = ["zxc","vbn"]
        String[] arr = {"zxc","vbn"};
        List<String> d = Arrays.asList(arr);
        assertThat(day.findLongestWord("apple", d), is(equalTo("")));
    }

}