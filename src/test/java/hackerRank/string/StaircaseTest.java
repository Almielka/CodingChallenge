package hackerRank.string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StaircaseTest {

    private Staircase solution;
    private final PrintStream out = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        solution = new Staircase();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(out);
    }

    @Test
    void testPlusMinus() {
        String expectedOutput =
                "     #\n" +
                "    ##\n" +
                "   ###\n" +
                "  ####\n" +
                " #####\n" +
                "######";
        solution.staircase(6);
        assertEquals(expectedOutput, outContent.toString());
        assertThat(outContent.toString(), is(equalTo(expectedOutput)));
    }

    @Test
    void testPlusMinus2() {
        String expectedOutput =
                "     #\n" +
                "    ##\n" +
                "   ###\n" +
                "  ####\n" +
                " #####\n" +
                "######";
        solution.staircase2(6);
        assertEquals(expectedOutput, outContent.toString());
        assertThat(outContent.toString(), is(equalTo(expectedOutput)));
    }

    @Test
    void testPlusMinus3() {
        String expectedOutput =
                "     #\n" +
                "    ##\n" +
                "   ###\n" +
                "  ####\n" +
                " #####\n" +
                "######";
        solution.staircase3(6);
        assertEquals(expectedOutput, outContent.toString());
        assertThat(outContent.toString(), is(equalTo(expectedOutput)));
    }

}