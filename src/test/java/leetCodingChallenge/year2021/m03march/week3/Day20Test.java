package leetCodingChallenge.year2021.m03march.week3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day20Test {

    Day20.UndergroundSystem undergroundSystem;

    @BeforeEach
    void setUp() {
        undergroundSystem = new Day20().new UndergroundSystem();
    }

    // undergroundSystem.getAverageTime("Paradise", "Cambridge");
    // return 14.00000. There was only one travel from "Paradise" (at time 8) to "Cambridge" (at time 22)
    // undergroundSystem.getAverageTime("Leyton", "Waterloo");
    // return 11.00000. There were two travels from "Leyton" to "Waterloo",
    // a customer with id=45 from time=3 to time=15 and a customer with id=27 from time=10 to time=20.
    // So the average time is ( (15-3) + (20-10) ) / 2 = 11.00000
    // undergroundSystem.getAverageTime("Leyton", "Waterloo");   // return 11.00000
    // undergroundSystem.getAverageTime("Leyton", "Waterloo");   // return 12.00000
    @Test
    void testGetAverageTime() {
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        assertThat(undergroundSystem.getAverageTime("Paradise", "Cambridge"), is(equalTo(14.00000)));
        assertThat(undergroundSystem.getAverageTime("Leyton", "Waterloo"), is(equalTo(11.00000)));
        undergroundSystem.checkIn(10, "Leyton", 24);
        assertThat(undergroundSystem.getAverageTime("Leyton", "Waterloo"), is(equalTo(11.00000)));
        undergroundSystem.checkOut(10, "Waterloo", 38);
        assertThat(undergroundSystem.getAverageTime("Leyton", "Waterloo"), is(equalTo(12.00000)));
    }

    @Test
    void testGetAverageTime2() {
        // Explanation
        // UndergroundSystem undergroundSystem = new UndergroundSystem();
        // undergroundSystem.checkIn(10, "Leyton", 3);
        // undergroundSystem.checkOut(10, "Paradise", 8);
        // undergroundSystem.getAverageTime("Leyton", "Paradise"); // return 5.00000
        // undergroundSystem.checkIn(5, "Leyton", 10);
        // undergroundSystem.checkOut(5, "Paradise", 16);
        // undergroundSystem.getAverageTime("Leyton", "Paradise"); // return 5.50000
        // undergroundSystem.checkIn(2, "Leyton", 21);
        // undergroundSystem.checkOut(2, "Paradise", 30);
        // undergroundSystem.getAverageTime("Leyton", "Paradise"); // return 6.66667
        undergroundSystem.checkIn(10, "Leyton", 3);
        undergroundSystem.checkOut(10, "Paradise", 8);
        assertThat(undergroundSystem.getAverageTime("Leyton", "Paradise"), is(equalTo(5.00000)));
        undergroundSystem.checkIn(5, "Leyton", 10);
        undergroundSystem.checkOut(5, "Paradise", 16);
        assertThat(undergroundSystem.getAverageTime("Leyton", "Paradise"), is(equalTo(5.50000)));
        undergroundSystem.checkIn(2, "Leyton", 21);
        undergroundSystem.checkOut(2, "Paradise", 30);
        assertThat(undergroundSystem.getAverageTime("Leyton", "Paradise"), is(equalTo(6.66667)));
    }

}