package hackerRank.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class StockPairTest {

    StockPair solution;

    @BeforeEach
    void setUp(){
        solution = new StockPair();
    }

    @Test
    void testStockPairs() {
        int[] arr = {5, 7, 9, 13, 11, 6, 6, 3, 3};
        List<Integer> list =  Arrays.stream(arr).boxed().collect(Collectors.toList());
        assertThat(solution.stockPairs(list, 12), is(equalTo(3)));
    }


    @Test
    void testStockPairs2() {
        int[] arr = {6, 1, 1, 3, 46, 1, 3, 9};
        List<Integer> list =  Arrays.stream(arr).boxed().collect(Collectors.toList());
        assertThat(solution.stockPairs(list, 47), is(equalTo(1)));
    }


    @Test
    void testStockPairs3() {
        int[] arr = {92,
                407,
                1152,
                403,
                1419,
                689,
                1029,
                108,
                128,
                1307,
                300,
                775,
                622,
                730,
                978,
                526,
                943,
                127,
                566,
                869,
                715,
                983,
                820,
                1394,
                901,
                606,
                497,
                98,
                1222,
                843,
                600,
                1153,
                302,
                1450,
                1457,
                973,
                1431,
                217,
                936,
                958,
                1258,
                970,
                1155,
                1061,
                1341,
                657,
                333,
                1151,
                790,
                101,
                588,
                263,
                101,
                534,
                747,
                405,
                585,
                111,
                849,
                695,
                1256,
                1508,
                139,
                336,
                1430,
                615,
                1295,
                550,
                783,
                575,
                992,
                709,
                828,
                1447,
                1457,
                738,
                1024,
                529,
                406,
                164,
                994,
                1008,
                50,
                811,
                564,
                580,
                952,
                768,
                863,
                1225,
                251,
                1032,
                1460};
        List<Integer> list =  Arrays.stream(arr).boxed().collect(Collectors.toList());
        assertThat(solution.stockPairs(list, 1558), is(equalTo(45)));
    }

}