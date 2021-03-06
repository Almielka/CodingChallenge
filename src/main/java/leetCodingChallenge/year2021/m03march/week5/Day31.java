package leetCodingChallenge.year2021.m03march.week5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anna S. Almielka
 * 31.03.2021
 */

public class Day31 {

    /**
     * You want to form a target string of lowercase letters.
     * At the beginning, your sequence is target.length '?' marks.  You also have a stamp of lowercase letters.
     * On each turn, you may place the stamp over the sequence, and replace every letter
     * in the sequence with the corresponding letter from the stamp.  You can make up to 10 * target.length turns.
     * <p>
     * For example, if the initial sequence is "?????", and your stamp is "abc",
     * then you may make "abc??", "?abc?", "??abc" in the first turn.
     * (Note that the stamp must be fully contained in the boundaries of the sequence in order to stamp.)
     * <p>
     * If the sequence is possible to stamp, then return an array of the index of
     * the left-most letter being stamped at each turn.
     * If the sequence is not possible to stamp, return an empty array.
     * <p>
     * For example, if the sequence is "ababc", and the stamp is "abc",
     * then we could return the answer [0, 2], corresponding to the moves "?????" -> "abc??" -> "ababc".
     * <p>
     * Also, if the sequence is possible to stamp, it is guaranteed it is possible
     * to stamp within 10 * target.length moves.
     * Any answers specifying more than this number of moves will not be accepted.
     * <p>
     * Note:
     * 1 <= stamp.length <= target.length <= 1000
     * stamp and target only contain lowercase letters.
     *
     * @param stamp  a string contains lowercase letters
     * @param target a string contains lowercase letters
     * @return an array of the index of the left-most letter being stamped at each turn
     */
    // Runtime: 4 ms
    // Memory Usage: 39.4 MB
    // Time Complexity: O(m (n - m))
    // Space Complexity: O(n + m)
    public int[] movesToStamp2(String stamp, String target) {
        if (target.equals(stamp)) return new int[]{0};
        char[] stampChars = stamp.toCharArray();
        char[] targetChars = target.toCharArray();
        int stampLength = stamp.length();
        int targetLength = target.length();
        List<Integer> list = new ArrayList<>();
        boolean isMatch;
        do {
            isMatch = false;
            for (int i = 0; i <= targetLength - stampLength; i++) {
                boolean checked = true;
                int index = 0;
                for (int j = 0; j < stampLength; j++) {
                    char current = targetChars[i + j];
                    if (current == '?') {
                        index++;
                    }
                    if (!(current == '?' || current == stampChars[j])) {
                        checked = false;
                        break;
                    }
                }
                if (checked && index < stampLength) {
                    isMatch = true;
                    list.add(0, i);
                    for (int j = 0; j < stampLength; j++) {
                        targetChars[i + j] = '?';
                    }
                }

            }
        } while (isMatch);

        for (char c : targetChars) {
            if (c != '?') return new int[0];
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private String str;
    public int[] movesToStamp(String stamp, String target) {
        if (target.equals(stamp)) return new int[]{0};
        str = target;
        List<Integer> list = new ArrayList<>();
        int sLength = stamp.length();
        int tLength = target.length();
        boolean[] visited = new boolean[tLength];
        int count = 0;
        while (count != tLength) {
            boolean isChanged = false;
            for (int i = 0; i <= tLength - sLength; i++) {
                int replace = replace(stamp, i);
                if (!visited[i] && replace != 0) {
                    count += replace;
                    visited[i] = true;
                    isChanged = true;
                    list.add(0, i);
                }
            }
            if (!isChanged) break;
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private int replace(String s, int pos) {
        int count = 0;
        StringBuilder builder = new StringBuilder(str);
        for (int i = 0; i < s.length(); i++) {
            char c = str.charAt(i + pos);
            if (c != '?' && c != s.charAt(i)) {
                builder.setCharAt(i + pos, '?');
                count++;
            }
        }
        str = builder.toString();
        return count;
    }

}

//    int can_replace(string &s, string &t , int pos){
//        for(int i=0;i<s.size();i++){
//            if(t[i+pos]!='?' && t[i+pos]!=s[i])return 0;
//        }
//        return 1;
//    }
//    int replace(string &s, string &t , int pos){
//        int replace=0;
//        for(int i=0;i<s.size();i++){
//            if(t[i+pos]!='?')t[i+pos]='?',replace++;
//        }
//        return replace;
//    }
//    vector<int> movesToStamp(string s, string t) {
//        vector<int>res,vis(t.size(),0);
//        int cnt=0;
//        while(cnt!=t.size()){
//            int change=0;
//            for(int i=0;i<=t.size()-s.size();i++){
//                if(vis[i]==0 && can_replace(s,t,i)){
//                    cnt+=replace(s,t,i);
//                    vis[i]=1;
//                    change=1;
//                    res.push_back(i);
//                }
//            }
//            if(change==0)return {};
//        }
//        reverse(res.begin(),res.end());
//        return res;
//    }