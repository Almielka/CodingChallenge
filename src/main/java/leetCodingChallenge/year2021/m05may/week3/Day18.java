package leetCodingChallenge.year2021.m05may.week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anna S. Almielka
 * 18.05.2021
 */

public class Day18 {

    /**
     * Given a list paths of directory info, including the directory path,
     * and all the files with contents in this directory,
     * return all the duplicate files in the file system in terms of their paths.
     * You may return the answer in any order.
     * <p>
     * A group of duplicate files consists of at least two files that have the same content.
     * A single directory info string in the input list has the following format:
     * "root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"
     * <p>
     * It means there are n files (f1.txt, f2.txt ... fn.txt) with content
     * (f1_content, f2_content ... fn_content) respectively in the directory "root/d1/d2/.../dm".
     * Note that n >= 1 and m >= 0. If m = 0, it means the directory is just the root directory.
     * <p>
     * The output is a list of groups of duplicate file paths.
     * For each group, it contains all the file paths of the files that have the same content.
     * A file path is a string that has the following format:
     * "directory_path/file_name.txt"
     * <p>
     * Constraints:
     * 1 <= paths.length <= 2 * 10^4
     * 1 <= paths[i].length <= 3000
     * 1 <= sum(paths[i].length) <= 5 * 10^5
     * paths[i] consist of English letters, digits, '/', '.', '(', ')', and ' '.
     * You may assume no files or directories share the same name in the same directory.
     * You may assume each given directory info represents a unique directory.
     * A single blank space separates the directory path and file info.
     *
     * @param paths a list paths of directory info
     * @return all the duplicate files in the file system in terms of their {@code paths}
     */
    // Runtime: 21 ms
    // Memory Usage: 48.4 MB
    // Time Complexity : O(nm) where n = paths.length, n = qty of files
    // Space Complexity: O(c) where c = qty of duplicates
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] files = path.split(" ");
            for (int i = 1; i < files.length; i++) {
                int p = files[i].indexOf('(');
                String key = files[i].substring(p);
                List<String> list = map.getOrDefault(key, new ArrayList<>());
                list.add(files[0] + "/" + files[i].substring(0, p));
                map.put(key, list);
            }
        }
        for (List<String> value : map.values()) {
            if (value.size() > 1) {
                result.add(value);
            }
        }
        return result;
    }

}
