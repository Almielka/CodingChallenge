package leetCode.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Anna S. Almielka
 */

public class LetterCasePermutation {

    /**
     * 784.Letter Case Permutation
     *
     * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.
     * <p>
     * Return a list of all possible strings we could create. You can return the output in any order.
     *
     * @param s a string
     * @return list of all possible strings we could create
     */
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>(Collections.singletonList(""));
        try {
            int digits = Integer.parseInt(s);
            result.set(0, String.valueOf(digits));
        } catch (NumberFormatException e) {
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    for (int i = 0; i < result.size(); i++) {
                        result.set(i, result.get(i) + c);
                    }
                } else {
                    int length = result.size();
                    for (int i = 0; i < length; i++) {
                        String str = result.remove(0);
                        result.add(str + String.valueOf(c).toLowerCase());
                        result.add(str + String.valueOf(c).toUpperCase());
                    }
                }
            }
        }
        return result;
    }

}
