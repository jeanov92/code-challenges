package hackerrank.algorithms.dayOfTheProgrammer;

public class DayOfTheProgrammer {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        // Write your code here
        int days = 243;
        int goal = 256;
        if (isLapYear(year)) {
            days++;
        } else if (year == 1918) {
            days -= 13;
        }

        return goal - days + ".09." + year;

    }

    private static boolean isLapYear(int year) {
        if (year < 1918) {
            if (year % 4 == 0) {
                return true;
            }
        } else {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                return true;
            }
        }
        return false;
    }
}
