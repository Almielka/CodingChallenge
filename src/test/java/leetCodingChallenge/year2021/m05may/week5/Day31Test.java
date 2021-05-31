package leetCodingChallenge.year2021.m05may.week5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day31Test {

    private Day31 day;

    @BeforeEach
    void setUp() {
        day = new Day31();
    }

    @Test
    void testSuggestedProducts() {
        // Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
        // Output: [
        // ["mobile","moneypot","monitor"],
        // ["mobile","moneypot","monitor"],
        // ["mouse","mousepad"],
        // ["mouse","mousepad"],
        // ["mouse","mousepad"]
        // ]
        // Explanation: products sorted lexicographically = ["mobile","moneypot","monitor","mouse","mousepad"]
        // After typing m and mo all products match and we show user ["mobile","moneypot","monitor"]
        // After typing mou, mous and mouse the system suggests ["mouse","mousepad"]
        String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String searchWord = "mouse";
        List<List<String>> result = Arrays.asList(
                Arrays.asList("mobile", "moneypot", "monitor"),
                Arrays.asList("mobile", "moneypot", "monitor"),
                Arrays.asList("mouse", "mousepad"),
                Arrays.asList("mouse", "mousepad"),
                Arrays.asList("mouse", "mousepad")
        );
        assertThat(day.suggestedProducts(products, searchWord), is(equalTo(result)));
        assertThat(day.suggestedProducts2(products, searchWord), is(equalTo(result)));
    }

    @Test
    void testSuggestedProducts2() {
        String[] products = {"havana"};
        String searchWord = "havana";
        List<List<String>> result = Arrays.asList(
                Collections.singletonList("havana"),
                Collections.singletonList("havana"),
                Collections.singletonList("havana"),
                Collections.singletonList("havana"),
                Collections.singletonList("havana"),
                Collections.singletonList("havana")
        );
        assertThat(day.suggestedProducts(products, searchWord), is(equalTo(result)));
        assertThat(day.suggestedProducts2(products, searchWord), is(equalTo(result)));
    }

    @Test
    void testSuggestedProducts3() {
        // Input: products = ["bags","baggage","banner","box","cloths"], searchWord = "bags"
        // Output: [["baggage","bags","banner"],["baggage","bags","banner"],["baggage","bags"],["bags"]]
        String[] products = {"bags", "baggage", "banner", "box", "cloths"};
        String searchWord = "bags";
        List<List<String>> result = Arrays.asList(
                Arrays.asList("baggage", "bags", "banner"),
                Arrays.asList("baggage", "bags", "banner"),
                Arrays.asList("baggage", "bags"),
                Collections.singletonList("bags")
        );
        assertThat(day.suggestedProducts(products, searchWord), is(equalTo(result)));
        assertThat(day.suggestedProducts2(products, searchWord), is(equalTo(result)));
    }

    @Test
    void testSuggestedProducts4() {
        String[] products = {"havana"};
        String searchWord = "tatiana";
        List<List<String>> result = Arrays.asList(
                Collections.emptyList(),
                Collections.emptyList(),
                Collections.emptyList(),
                Collections.emptyList(),
                Collections.emptyList(),
                Collections.emptyList(),
                Collections.emptyList()
        );
        assertThat(day.suggestedProducts(products, searchWord), is(equalTo(result)));
        assertThat(day.suggestedProducts2(products, searchWord), is(equalTo(result)));
    }

}