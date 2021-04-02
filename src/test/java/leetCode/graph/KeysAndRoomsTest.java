package leetCode.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class KeysAndRoomsTest {

    private KeysAndRooms day;

    @BeforeEach
    void setUp() {
        day = new KeysAndRooms();
    }

    @Test
    void testСanVisitAllRooms() {
        // Input: [[1],[2],[3],[]]
        // Output: true
        // Explanation:
        // We start in room 0, and pick up key 1.
        // We then go to room 1, and pick up key 2.
        // We then go to room 2, and pick up key 3.
        // We then go to room 3.  Since we were able to go to every room, we return true.
        int[] arr1 = {1};
        int[] arr2 = {2};
        int[] arr3 = {3};
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.stream(arr1).boxed().collect(Collectors.toList()));
        rooms.add(Arrays.stream(arr2).boxed().collect(Collectors.toList()));
        rooms.add(Arrays.stream(arr3).boxed().collect(Collectors.toList()));
        rooms.add(new ArrayList<>());
        assertThat(day.canVisitAllRooms(rooms), is(equalTo(true)));
        assertThat(day.canVisitAllRooms2(rooms), is(equalTo(true)));
    }

    @Test
    void testСanVisitAllRooms2() {
        // Input: [[1,3],[3,0,1],[2],[0]]
        // Output: false
        // Explanation: We can't enter the room with number 2.
        int[] arr1 = {1, 3};
        int[] arr2 = {3, 0, 1};
        int[] arr3 = {2};
        int[] arr4 = {0};
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.stream(arr1).boxed().collect(Collectors.toList()));
        rooms.add(Arrays.stream(arr2).boxed().collect(Collectors.toList()));
        rooms.add(Arrays.stream(arr3).boxed().collect(Collectors.toList()));
        rooms.add(Arrays.stream(arr4).boxed().collect(Collectors.toList()));
        assertThat(day.canVisitAllRooms(rooms), is(equalTo(false)));
        assertThat(day.canVisitAllRooms2(rooms), is(equalTo(false)));
    }

}