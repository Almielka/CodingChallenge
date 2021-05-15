package leetCodingChallenge.year2021.m05may.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day11Test {

    private Day11 day;

    @BeforeEach
    void setUp() {
        day = new Day11();
    }

    @Test
    void testMaxScore() {
        // Input: cardPoints = [1,2,3,4,5,6,1], k = 3
        // Output: 12
        // Explanation: After the first step, your score will always be 1.
        // However, choosing the rightmost card first will maximize your total score.
        // The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        assertThat(day.maxScore(cardPoints, 3), is(equalTo(12)));
    }

    @Test
    void testMaxScore2() {
        // Input: cardPoints = [2,2,2], k = 2
        // Output: 4
        // Explanation: Regardless of which two cards you take, your score will always be 4.
        int[] cardPoints = {2, 2, 2};
        assertThat(day.maxScore(cardPoints, 2), is(equalTo(4)));
    }

    @Test
    void testMaxScore3() {
        // Input: cardPoints = [9,7,7,9,7,7,9], k = 7
        //  Output: 55
        //Explanation: You have to take all the cards. Your score is the sum of points of all cards.
        int[] cardPoints = {9, 7, 7, 9, 7, 7, 9};
        assertThat(day.maxScore(cardPoints, 7), is(equalTo(55)));
    }

    @Test
    void testMaxScore4() {
        // Input: cardPoints = [1,1000,1], k = 1
        // Output: 1
        // Explanation: You cannot take the card in the middle. Your best score is 1.
        int[] cardPoints = {1, 1000, 1};
        assertThat(day.maxScore(cardPoints, 1), is(equalTo(1)));
    }

    @Test
    void testMaxScore5() {
        // Input: cardPoints = [1,79,80,1,1,1,200,1], k = 3
        // Output: 202
        int[] cardPoints = {1, 79, 80, 1, 1, 1, 200, 1};
        assertThat(day.maxScore(cardPoints, 3), is(equalTo(202)));
    }

    @Test
    void testMaxScore6() {
        int[] cardPoints = {100, 40, 17, 9, 73, 75};
        assertThat(day.maxScore(cardPoints, 3), is(equalTo(248)));
    }

}
