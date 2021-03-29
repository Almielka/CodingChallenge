package leetCode.array;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Anna S. Almielka
 */

public class DistributeCandies {

    /**
     * 575.Distribute Candies
     * <p>
     * Alice has n candies, where the ith candy is of type candyType[i].
     * Alice noticed that she started to gain weight, so she visited a doctor.
     * <p>
     * The doctor advised Alice to only eat n / 2 of the candies she has (n is always even).
     * Alice likes her candies very much, and she wants to eat the maximum number
     * of different types of candies while still following the doctor's advice.
     * <p>
     * Given the integer array candyType of length n, return the maximum number
     * of different types of candies she can eat if she only eats n / 2 of them.
     * <p>
     * Constraints:
     * <p>
     * n == candyType.length
     * 2 <= n <= 10<sup>4</sup>
     * n is even.
     * -10<sup>5</sup> <= candyType[i] <= 10<sup>5</sup>
     *
     * @param candyType an array of integers
     * @return an integer the maximum number of different integers
     */
    // Runtime: 40 ms
    // Memory Usage: 41.2 MB
    public int distributeCandies(int[] candyType) {
        int max = candyType.length / 2;
        Set<Integer> set = IntStream.of(candyType).boxed().collect(Collectors.toSet());
        return Math.min(set.size(), max);
    }

    // Runtime: 32 ms
    // Memory Usage: 40.4 MB
    public int distributeCandies2(int[] candyType) {
        Arrays.sort(candyType);
        int count = 1;
        for (int i = 0; i < candyType.length - 1 && count < candyType.length / 2; i++) {
            if (candyType[i + 1] > candyType[i]) count++;
        }
        return count;
    }

    // Runtime: 4 ms
    // Memory Usage: 40.7 MB
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int distributeCandies3(int[] candyType) {
        boolean[] checked = new boolean[200001];
        int count = 0;
        for (int i = 0; i < candyType.length && count < candyType.length / 2; i++) {
            int index = candyType[i] + 100000;
            if (!checked[index]) {
                count++;
                checked[index] = true;
            }
        }
        return count;
    }

}