package hackerRank.array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PlusMinusTest {

    private PlusMinus solution;
    private final PrintStream out = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        solution = new PlusMinus();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(out);
    }

    @Test
    void testPlusMinus() {
        int[] arr = {1, 1, 0, -1, -1};
        String expectedOutput = "0,400000\n0,400000\n0,200000\n";
        solution.plusMinus(arr);
        assertEquals(expectedOutput, outContent.toString());
        assertThat(outContent.toString(), is(equalTo(expectedOutput)));
    }

    @Test
    void testPlusMinus2() {
        int[] arr = {-4, 3, -9, 0, 4, 1};
        String expectedOutput = "0,500000\n0,333333\n0,166667\n";
        solution.plusMinus(arr);
        assertEquals(expectedOutput, outContent.toString());
        assertThat(outContent.toString(), is(equalTo(expectedOutput)));
    }

}