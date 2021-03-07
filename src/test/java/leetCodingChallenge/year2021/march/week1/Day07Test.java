package leetCodingChallenge.year2021.march.week1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class Day07Test {

    @Test
    void testMyHashMap() {
        Day07.MyHashMap hashMap = new Day07().new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        assertThat(hashMap.get(1), is(equalTo(1)));
        assertThat(hashMap.get(3), is(equalTo(-1)));
        hashMap.put(2, 1);
        assertThat(hashMap.get(2), is(equalTo(1)));
        hashMap.remove(2);
        assertThat(hashMap.get(2), is(equalTo(-1)));
    }

}