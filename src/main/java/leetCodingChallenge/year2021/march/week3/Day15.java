package leetCodingChallenge.year2021.march.week3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anna S. Almielka
 * 15.03.2021
 */

public class Day15 {

    /**
     * TinyURL is a URL shortening service where you enter
     * a URL such as https://leetcode.com/problems/design-tinyurl and it returns
     * a short URL such as http://tinyurl.com/4e9iAk.
     * <p>
     * Design the encode and decode methods for the TinyURL service.
     * There is no restriction on how your encode/decode algorithm should work.
     * You just need to ensure that a URL can be encoded to a tiny URL and
     * the tiny URL can be decoded to the original URL.
     * Your Codec object will be instantiated and called as such:
     * Codec codec = new Codec();
     * codec.decode(codec.encode(url));
     */
    // Runtime: 5 ms
    // Memory Usage: 38.8 MB
    public class Codec {

        private final Map<String, String> urls = new HashMap<>();
        private static final String URL = "http://tinyurl.com/";

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String shortUrl = URL + longUrl.hashCode();
            urls.put(shortUrl, longUrl);
            return shortUrl;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return urls.get(shortUrl);
        }
    }

}
