package leetCodingChallenge.year2021.m02february.week1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anna S. Almielka
 * 05.02.2021
 */

public class Day05 {

    /**
     * Given a string path, which is an absolute path (starting with a slash '/')
     * to a file or directory in a Unix-style file system, convert it to the simplified canonical path.
     *
     * In a Unix-style file system, a period '.' refers to the current directory,
     * a double period '..' refers to the directory up a level,
     * and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'.
     * For this problem, any other format of periods such as '...' are treated as file/directory names.
     *
     * The canonical path should have the following format:
     *
     * The path starts with a single slash '/'.
     * Any two directories are separated by a single slash '/'.
     * The path does not end with a trailing '/'.
     * The path only contains the directories on the path from the root directory
     * to the target file or directory (i.e., no period '.' or double period '..')
     * Return the simplified canonical path.
     *
     * @param path a string path in a Unix-style file system
     * @return the simplified canonical path
     */
    //Time complexity : O(n)
    //Space complexity : O(n)
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        List<String> list = new ArrayList<>();
        for (String part : parts) {
            if (part.matches("(\\d|\\.*?\\w)+") || part.equals("...")) {
                list.add(part);
            }
            if (part.equals("..")) {
                if (list.size() > 0) {
                    list.remove(list.size() - 1);
                }
            }
        }
        return "/" + String.join("/", list);
    }

}
