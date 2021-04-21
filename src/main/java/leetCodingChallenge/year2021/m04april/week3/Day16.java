package leetCodingChallenge.year2021.m04april.week3;

public class Day16 {

    /**
     * Given a string s, a k duplicate removal consists of choosing k adjacent and
     * equal letters from s and removing them causing the left and the right side
     * of the deleted substring to concatenate together.
     * <p>
     * We repeatedly make k duplicate removals on s until we no longer can.
     * Return the final string after all such duplicate removals have been made.
     * It is guaranteed that the answer is unique.
     * <p>
     * Constraints:
     * 1 <= s.length <= 10^5
     * 2 <= k <= 10^4
     * s only contains lower case English letters.
     *
     * @param s a string
     * @param k an integer number of duplicate for searching
     * @return final string without all duplicate
     */
    // Runtime: 2 ms
    // Memory Usage: 39.2 MB
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public String removeDuplicates(String s, int k) {
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            if (count == k) {
                s = removeDuplicates(s.substring(0, i - k + 1) + s.substring(i + 1), k);
            }
        }
        return s;
    }

}
