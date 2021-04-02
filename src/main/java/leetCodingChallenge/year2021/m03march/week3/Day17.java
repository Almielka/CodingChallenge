package leetCodingChallenge.year2021.m03march.week3;

import java.util.Random;

/**
 * @author Anna S. Almielka
 * 17.03.2021
 */

public class Day17 {
    /**
     * Given the radius and x-y positions of the center of a circle,
     * write a function randPoint which generates a uniform random point in the circle.
     * <p>
     * Note:
     * input and output values are in floating-point.
     * radius and x-y position of the center of the circle is passed into the class constructor.
     * a point on the circumference of the circle is considered to be in the circle.
     * randPoint returns a size 2 array containing x-position and y-position of the random point, in that order.
     * <p>
     * Explanation of Input Syntax:
     * The input is two lists: the subroutines called and their arguments.
     * Solution's constructor has three arguments, the radius,
     * x-position of the center, and y-position of the center of the circle.
     * randPoint has no arguments.
     * Arguments are always wrapped with a list, even if there aren't any.
     */
    // Runtime: 202 ms
    // Memory Usage: 49.7 MB
    private double radius;
    private double x_center;
    private double y_center;
    private static final Random random = new Random();

    public Day17(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public double[] randPoint() {
        double r = radius * Math.sqrt(random.nextDouble());
        double theta = random.nextDouble() * 2 * Math.PI;
        // convert this to Cartesian coordinates
        double x = x_center + r * Math.cos(theta);
        double y = y_center + r * Math.sin(theta);
        return new double[]{x, y};
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */