package leetCodingChallenge.year2021.march.week1;

import java.util.Arrays;

/**
 * @author Anna S. Almielka
 * 07.03.2021
 */

public class Day07 {

    /**
     * Design a HashMap without using any built-in hash table libraries.
     * <p>
     * To be specific, your design should include these functions:
     * put(key, value) : Insert a (key, value) pair into the HashMap. If the value already exists in the HashMap, update the value.
     * get(key): Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
     * remove(key) : Remove the mapping for the value key if this map contains the mapping for the key.
     * <p>
     * Note:
     * All keys and values will be in the range of [0, 1000000].
     * The number of operations will be in the range of [1, 10000].
     * Please do not use the built-in HashMap library.
     */
    // Runtime: 32 ms
    // Memory Usage: 46.3 MB
    class MyHashMap {

        int[] map;

        /**
         * Initialize your data structure here.
         */
        public MyHashMap() {
            map = new int[1000000];
            Arrays.fill(map, -1);
        }

        /**
         * value will always be non-negative.
         */
        public void put(int key, int value) {
            map[key] = value;
        }

        /**
         * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
         */
        public int get(int key) {
            return map[key];
        }

        /**
         * Removes the mapping of the specified value key if this map contains a mapping for the key
         */
        public void remove(int key) {
            map[key] = -1;
        }
    }

    /**
     * Your MyHashMap object will be instantiated and called as such:
     * MyHashMap obj = new MyHashMap();
     * obj.put(key,value);
     * int param_2 = obj.get(key);
     * obj.remove(key);
     */

}
