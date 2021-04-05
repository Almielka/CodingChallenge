package hackerRank.string;

/**
 * @author Anna S. Almielka
 */

public class Staircase {

    /**
     * This is a staircase of size n = 4:
     *    #
     *   ##
     *  ###
     * ####
     * Its base and height are both equal to n. It is drawn using # symbols and spaces.
     * The last line is not preceded by any spaces.
     * <p>
     * Write a program that prints a staircase of size n.
     * <p>
     * Constraints:
     * 0 < n <= 100
     *
     * @param n an integer
     */
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.print((i != n) ? "\n" : "");
        }

    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public void staircase2(int n) {
        for (int i = 1; i <= n; i++) {
            String s = padRight("", i);
            System.out.print(padLeft(s, n));
            System.out.print((i != n) ? "\n" : "");
        }
    }

    private String padLeft(String s, int n) {
        return String.format("%1$" + n + "s", s);
    }

    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s).replace(' ', '#');
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public void staircase3(int n) {
        for (int i = 1; i <= n; i++) {
            String s = "#".repeat(i);
            System.out.printf("%" + n + "s", s);
            System.out.print((i != n) ? "\n" : "");
        }
    }

}
