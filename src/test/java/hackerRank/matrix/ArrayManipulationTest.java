package hackerRank.matrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class ArrayManipulationTest {

    private ArrayManipulation solution;

    @BeforeEach
    void setUp() {
        solution = new ArrayManipulation();
    }

    @Test
    void testArrayManipulation() {
        int[][] queries = {{1, 5, 3}, {4, 8, 7}, {6, 9, 1}};
        assertThat(solution.arrayManipulation(10, queries), is(equalTo(10L)));
    }

    @Test
    void testArrayManipulation2() {
        int[][] queries = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
        assertThat(solution.arrayManipulation(5, queries), is(equalTo(200L)));
    }

    @Test
    void testArrayManipulation3() {
        int[][] queries = {{2, 6, 8}, {3, 5, 7}, {1, 8, 1}, {5, 9, 15}};
        assertThat(solution.arrayManipulation(10, queries), is(equalTo(31L)));
    }

    @Test
    void testArrayManipulation4() {
        String input = "src/test/java/hackerRank/matrix/ArrayManipulationTest-input.txt";
        String getData = "";
        try {
            getData = Files.readString(Paths.get(input));
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> list = Arrays.stream(getData.split("\n")).collect(Collectors.toList());
        int[][] queries = new int[list.size()][3];
        for (int i = 0; i < list.size(); i++) {
            String[] queriesRowItems = list.get(i).split("\\s");
            for (int j = 0; j < 3; j++) {

                int i1 = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = i1;
            }

        }
        assertThat(solution.arrayManipulation(4000, queries), is(equalTo(7515267971L)));
    }

    @Test
    void testArrayManipulation5() {
        String input = "src/test/java/hackerRank/matrix/ArrayManipulationTest-input2.txt";
        String getData = "";
        try {
            getData = Files.readString(Paths.get(input));
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> list = Arrays.stream(getData.split("\n")).collect(Collectors.toList());
        int[][] queries = new int[list.size()][3];
        for (int i = 0; i < list.size(); i++) {
            String[] queriesRowItems = list.get(i).split("\\s");
            for (int j = 0; j < 3; j++) {

                int i1 = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = i1;
            }

        }
        assertThat(solution.arrayManipulation(10000000, queries), is(equalTo(2490686975L)));
    }

}