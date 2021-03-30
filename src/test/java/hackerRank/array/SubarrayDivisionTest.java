package hackerRank.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class SubarrayDivisionTest {

    private SubarrayDivision solution;

    @BeforeEach
    void setUp() {
        solution = new SubarrayDivision();
    }

    @Test
    void testBirthday() {
        int[] arr = {2, 2, 1, 3, 2};
        List<Integer> s = Arrays.stream(arr).boxed().collect(Collectors.toList());
        assertThat(solution.birthday(s, 4, 2), is(equalTo(2)));
    }

    @Test
    void testBirthday2() {
        int[] arr = {1, 2, 1, 3, 2};
        List<Integer> s = Arrays.stream(arr).boxed().collect(Collectors.toList());
        assertThat(solution.birthday(s, 3, 2), is(equalTo(2)));
    }

    @Test
    void testBirthday3() {
        int[] arr = {1, 1, 1, 1, 1, 1};
        List<Integer> s = Arrays.stream(arr).boxed().collect(Collectors.toList());
        assertThat(solution.birthday(s, 3, 2), is(equalTo(0)));
    }

    @Test
    void testBirthday4() {
        int[] arr = {4};
        List<Integer> s = Arrays.stream(arr).boxed().collect(Collectors.toList());
        assertThat(solution.birthday(s, 4, 1), is(equalTo(1)));
    }

}