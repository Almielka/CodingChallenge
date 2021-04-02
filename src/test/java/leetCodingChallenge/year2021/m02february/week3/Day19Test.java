package leetCodingChallenge.year2021.m02february.week3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day19Test {

    private Day19 day;

    @BeforeEach
    void setUp() {
        day = new Day19();
    }

    @Test
    void testMinRemoveToMakeValid() {
        // Input: s = "lee(t(c)o)de)"
        // Output: "lee(t(c)o)de"
        // Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
        assertThat(day.minRemoveToMakeValid("lee(t(c)o)de)"), is(equalTo("lee(t(c)o)de")));
    }

    @Test
    void testMinRemoveToMakeValid2() {
        assertThat(day.minRemoveToMakeValid("a)b(c)d"), is(equalTo("ab(c)d")));
    }

    @Test
    void testMinRemoveToMakeValid3() {
        assertThat(day.minRemoveToMakeValid("))(("), is(equalTo("")));
    }

    @Test
    void testMinRemoveToMakeValid4() {
        assertThat(day.minRemoveToMakeValid("(a(b(c)d)"), is(equalTo("(a(bc)d)")));
    }

    @Test
    void testMinRemoveToMakeValid5() {
        assertThat(day.minRemoveToMakeValid("(a)b(c)o(d"), is(equalTo("(a)b(c)od")));
    }

    @Test
    void testMinRemoveToMakeValid6() {
        assertThat(day.minRemoveToMakeValid("())()((("), is(equalTo("()()")));
    }

}