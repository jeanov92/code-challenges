package hackerrank.algorithms.migratoryBirds;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MigratoryBirdsTest {

    @Test
    void migratoryBirds1() {
        int output = MigratoryBirds.migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 3));
        assertEquals(4, output);
    }

    @Test
    void migratoryBirds2() {
        int output = MigratoryBirds.migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4));
        assertEquals(3, output);
    }
}