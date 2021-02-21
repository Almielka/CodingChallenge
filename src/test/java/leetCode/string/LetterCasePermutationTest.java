package leetCode.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class LetterCasePermutationTest {

    private LetterCasePermutation day;

    @BeforeEach
    void setUp() {
        day = new LetterCasePermutation();
    }

    @Test
    void testLetterCasePermutation() {
        String[] arr = new String[]{"a1b2", "a1B2", "A1b2", "A1B2"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.letterCasePermutation("a1b2"), is(equalTo(result)));
    }

    @Test
    void testLetterCasePermutation2() {
        String[] arr = new String[]{"3z4", "3Z4"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.letterCasePermutation("3z4"), is(equalTo(result)));
    }

    @Test
    void testLetterCasePermutation3() {
        String[] arr = new String[]{"12345"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.letterCasePermutation("12345"), is(equalTo(result)));
    }

    @Test
    void testLetterCasePermutation4() {
        String[] arr = new String[]{"0"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.letterCasePermutation("0"), is(equalTo(result)));
    }

}