package leetCodingChallenge.year2021.m05may.week5;

import java.util.*;

/**
 * @author Anna S. Almielka
 * 31.05.2021
 */

public class Day31 {

    /**
     * Given an array of strings products and a string searchWord.
     * We want to design a system that suggests at most three product names
     * from products after each character of searchWord is typed.
     * Suggested products should have common prefix with the searchWord.
     * If there are more than three products with a common prefix
     * return the three lexicographically minimums products.
     * <p>
     * Return list of lists of the suggested products after each character of searchWord is typed.
     * <p>
     * Constraints:
     * 1 <= products.length <= 1000
     * There are no repeated elements in products.
     * 1 <= Σ products[i].length <= 2 * 10^4
     * All characters of products[i] are lower-case English letters.
     * 1 <= searchWord.length <= 1000
     * All characters of searchWord are lower-case English letters.
     *
     * @param products   an array of strings
     * @param searchWord a string
     * @return list of lists of strings
     */
    // Runtime: 263 ms
    // Memory Usage: 244.3 MB
    // Time Complexity: O(n * m) where n = products.size(), m = searchWord.length()
    // Space Complexity: O(1) excluding output space required for result
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        Arrays.sort(products);
        for (int i = searchWord.length() - 1; i >= 0; i--) {
            List<String> list = new ArrayList<>();
            for (String product : products) {
                if (product.startsWith(searchWord.substring(0, i + 1)) && list.size() < 3) {
                    list.add(product);
                }
            }
            result.add(0, list);
        }
        return result;
    }

    // Runtime: 25 ms
    // Memory Usage: 47.3 MB
    public List<List<String>> suggestedProducts2(String[] products, String searchWord) {
        Arrays.sort(products);
        Trie root = new Trie();
        for (String product : products) {
            Trie n = root;
            for (char ch : product.toCharArray()) {
                int i = ch - 'a';
                if (n.next[i] == null) {
                    n.next[i] = new Trie();
                }
                n = n.next[i];
                if (n.words.size() < 3)
                    n.words.add(product);
            }
        }

        List<List<String>> res = new ArrayList();
        Trie n = root;
        //start going over the search word char by char
        for (int i = 0; i < searchWord.length(); i++) {
            n = n.next[searchWord.charAt(i) - 'a'];
            //if we met null - means no more matches possible, the result of result can be filled by empty lists
            if (n == null) {
                for (int j = i; j < searchWord.length(); j++)
                    res.add(Collections.EMPTY_LIST);
                break;
            }
            res.add(n.words);
        }
        return res;
    }
    //trie node
    class Trie {
        Trie[] next;
        List<String> words;
        Trie() {
            words = new ArrayList();
            next = new Trie[26];
        }
    }

}
