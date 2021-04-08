package leetCodingChallenge.year2021.m04april.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day07Test {

    private Day07 day;

    @BeforeEach
    void setUp() {
        day = new Day07();
    }

    @Test
    void testHalvesAreAlike() {
        // Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
        assertThat(day.halvesAreAlike("book"), is(equalTo(true)));
        assertThat(day.halvesAreAlike2("book"), is(equalTo(true)));
    }

    @Test
    void testHalvesAreAlike2() {
        // Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
        // Notice that the vowel o is counted twice.
        assertThat(day.halvesAreAlike("textbook"), is(equalTo(false)));
        assertThat(day.halvesAreAlike2("textbook"), is(equalTo(false)));
    }

    @Test
    void testHalvesAreAlike3() {
        assertThat(day.halvesAreAlike("MerryChristmas"), is(equalTo(false)));
        assertThat(day.halvesAreAlike2("MerryChristmas"), is(equalTo(false)));
    }

    @Test
    void testHalvesAreAlike4() {
        assertThat(day.halvesAreAlike("AbCdEfGh"), is(equalTo(true)));
        assertThat(day.halvesAreAlike2("AbCdEfGh"), is(equalTo(true)));
    }

    @Test
    void testHalvesAreAlike5() {
        assertThat(day.halvesAreAlike("bbCdkfGh"), is(equalTo(true)));
        assertThat(day.halvesAreAlike2("bbCdkfGh"), is(equalTo(true)));
    }

}