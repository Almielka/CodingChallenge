package leetCode.string;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class SimplifyPathTest {

    private SimplifyPath day;

    @BeforeEach
    void setUp() {
        day = new SimplifyPath();
    }

    @Test
    void testSimplifyPath() {
        assertThat(day.simplifyPath("/home/"), is(equalTo("/home")));
    }

    @Test
    void testSimplifyPath2() {
        assertThat(day.simplifyPath("/../"), is(equalTo("/")));
    }

    @Test
    void testSimplifyPath3() {
        assertThat(day.simplifyPath("/home//foo/"), is(equalTo("/home/foo")));
    }

    @Test
    void testSimplifyPath4() {
        assertThat(day.simplifyPath("/a/./b/../../c/"), is(equalTo("/c")));
    }

    @Test
    void testSimplifyPath5() {
        assertThat(day.simplifyPath("/..."), is(equalTo("/...")));
    }

    @Test
    void testSimplifyPath6() {
        assertThat(day.simplifyPath("/..hidden"), is(equalTo("/..hidden")));
    }

}