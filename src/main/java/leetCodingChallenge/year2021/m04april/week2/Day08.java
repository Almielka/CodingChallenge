package leetCodingChallenge.year2021.m04april.week2;

import java.util.*;

/**
 * @author Anna S. Almielka
 * 08.04.2021
 */

public class Day08 {

    /**
     * Given a string containing digits from 2-9 inclusive,
     * return all possible letter combinations that the number could represent.
     * Return the answer in any order.
     * A mapping of digit to letters (just like on the telephone buttons) is given below.
     * 2 – abc
     * 3 – def
     * 4 – ghi
     * 5 – jkl
     * 6 – mno
     * 7 – pqrs
     * 8 – tuv
     * 9 – wxyz
     * Note that 1 does not map to any letters.
     * Constraints:
     * 0 <= digits.length <= 4
     * digits[i] is a digit in the range ['2', '9'].
     *
     * @param digits a string containing digits from 2-9 inclusive
     * @return a list of strings
     */

    private static Map<Character, String> letters = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
    );

    // Runtime: 5 ms
    // Memory Usage: 39.3 MB
    public List<String> letterCombinations(String digits) {
        int length = digits.length();
        if (length == 0) return new ArrayList<>();
        List<String> result = new ArrayList<>(Collections.singletonList(""));
        Queue<String> queue = new LinkedList<>();
        int index = 0;
        queue.offer(letters.get(digits.charAt(index)));
        while (!queue.isEmpty()) {
            String s = queue.poll();
            int size = result.size();
            for (int i = 0; i < size; i++) {
                String floating = result.remove(0);
                for (int j = 0; j < s.length(); j++) {
                    result.add(floating + s.charAt(j));
                }
            }
            if (result.get(0).length() == length) return result;
            queue.offer(letters.get(digits.charAt(++index)));
        }
        return result;
    }

}
