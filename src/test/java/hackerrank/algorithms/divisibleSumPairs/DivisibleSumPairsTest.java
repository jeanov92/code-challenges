package hackerrank.algorithms.divisibleSumPairs;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisibleSumPairsTest {

    @Test
    void divisibleSumPairs() {
        int output = DivisibleSumPairs.divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2));
        assertEquals(5, output);
    }
}