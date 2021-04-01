package leetCodingChallenge.year2021.march.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void testSpellchecker() {
        String[] wordlist = {"KiTe", "kite", "hare", "Hare"};
        String[] queries = {"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"};
        String[] output = {"kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe"};
        assertThat(day.spellchecker(wordlist, queries), is(equalTo(output)));
    }

    @Test
    void testSpellchecker2() {
        String[] wordlist = {"yellow"};
        String[] queries = {"YellOw", "yellow"};
        String[] output = {"yellow", "yellow"};
        assertThat(day.spellchecker(wordlist, queries), is(equalTo(output)));
    }

    @Test
    void testSpellchecker3() {
        String[] wordlist = {"YellOw"};
        String[] queries = {"yollow", "yeellow", "yllw"};
        String[] output = {"YellOw", "", ""};
        assertThat(day.spellchecker(wordlist, queries), is(equalTo(output)));
    }

}