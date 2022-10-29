package hackerrank.algorithms.subarrayDivision;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubarrayDivisionTest {

    @Test
    void birthday1() {
        int output = SubarrayDivision.birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2);
        assertEquals(2, output);
    }

    @Test
    void birthday2() {
        int output = SubarrayDivision.birthday(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2);
        assertEquals(0, output);
    }

    @Test
    void birthday3() {
        int output = SubarrayDivision.birthday(Arrays.asList(4), 4, 1);
        assertEquals(1, output);
    }
}