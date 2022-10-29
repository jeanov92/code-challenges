package hackerrank.algorithms.breakingTheRecords;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BrakingTheRecordsTest {

    @Test
    void breakingRecords1() {
        List<Integer> output = BrakingTheRecords.breakingRecords(Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1));

        assertEquals(2, output.size());
        assertEquals(2, output.get(0));
        assertEquals(4, output.get(1));
    }
    @Test
    void breakingRecords2() {
        List<Integer> output = BrakingTheRecords.breakingRecords(Arrays.asList(3, 4, 21, 36, 10, 28 ,35, 5, 24, 42));

        assertEquals(2, output.size());
        assertEquals(4, output.get(0));
        assertEquals(0, output.get(1));
    }
}