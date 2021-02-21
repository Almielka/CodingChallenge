package leetCode.string;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class ValidAnagramTest {

    private ValidAnagram day;

    @BeforeEach
    void setUp() {
        day = new ValidAnagram();
    }

    @Test
    void testIsAnagram() {
        assertThat(day.isAnagram("anagram", "nagaram"), is(equalTo(true)));
    }

    @Test
    void testIsAnagram2() {
        assertThat(day.isAnagram("rat", "car"), is(equalTo(false)));
    }

}