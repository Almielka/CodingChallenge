package leetCodingChallenge.year2021.march.week4;

import java.util.*;

/**
 * @author Anna S. Almielka
 * 22.03.2021
 */

public class Day22 {

    /**
     * Given a wordlist, we want to implement a spellchecker that converts a query word into a correct word.
     * <p>
     * For a given query word, the spell checker handles two categories of spelling mistakes:
     * <p>
     * Capitalization: If the query matches a word in the wordlist (case-insensitive),
     * then the query word is returned with the same case as the case in the wordlist.
     * Example: wordlist = ["yellow"], query = "YellOw": correct = "yellow"
     * Example: wordlist = ["Yellow"], query = "yellow": correct = "Yellow"
     * Example: wordlist = ["yellow"], query = "yellow": correct = "yellow"
     * Vowel Errors: If after replacing the vowels ('a', 'e', 'i', 'o', 'u') of the query word
     * with any vowel individually, it matches a word in the wordlist (case-insensitive),
     * then the query word is returned with the same case as the match in the wordlist.
     * Example: wordlist = ["YellOw"], query = "yollow": correct = "YellOw"
     * Example: wordlist = ["YellOw"], query = "yeellow": correct = "" (no match)
     * Example: wordlist = ["YellOw"], query = "yllw": correct = "" (no match)
     * In addition, the spell checker operates under the following precedence rules:
     * <p>
     * When the query exactly matches a word in the wordlist (case-sensitive), you should return the same word back.
     * When the query matches a word up to capitlization, you should return the first such match in the wordlist.
     * When the query matches a word up to vowel errors, you should return the first such match in the wordlist.
     * If the query has no matches in the wordlist, you should return the empty string.
     * Given some queries, return a list of words answer, where answer[i] is the correct word for query = queries[i].
     * <p>
     * Note:
     * 1 <= wordlist.length <= 5000
     * 1 <= queries.length <= 5000
     * 1 <= wordlist[i].length <= 7
     * 1 <= queries[i].length <= 7
     * All strings in wordlist and queries consist only of english letters.
     *
     * @param wordlist an array of correct words
     * @param queries  an array of queries
     * @return a list of words answer, where answer[i] is the correct word for query = queries[i]
     */
    // Runtime: 20 ms
    // Memory Usage: 42.6 MB
    // Time complexity: O(m + n)
    // Space complexity: O(m + n)
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> originalWords = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> words = new HashMap<>();

        for (String s : wordlist) {
            words.putIfAbsent(s.toLowerCase(), s);
            words.putIfAbsent(vowelError(s.toLowerCase()), s);
        }

        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            if (originalWords.contains(query)) continue;
            String lowerCase = query.toLowerCase();
            String vowelErrors = vowelError(query.toLowerCase());
            if (words.containsKey(lowerCase)) {
                queries[i] = words.get(lowerCase);
            } else queries[i] = words.getOrDefault(vowelErrors, "");
        }
        return queries;
    }

    private String vowelError(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(isVowel(c) ? '0' : c);
        }
        return sb.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
