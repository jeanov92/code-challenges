package hackerrank.algorithms.dayOfTheProgrammer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheProgrammerTest {

    @Test
    void dayOfProgrammer1() {
        String output = DayOfTheProgrammer.dayOfProgrammer(2017);
        assertEquals("13.09.2017", output);
    }

    @Test
    void dayOfProgrammer2() {
        String output = DayOfTheProgrammer.dayOfProgrammer(2016);
        assertEquals("12.09.2016", output);
    }

    @Test
    void dayOfProgrammer3() {
        String output = DayOfTheProgrammer.dayOfProgrammer(1800);
        assertEquals("12.09.1800", output);
    }
}