package hackerrank.preparation.day1.timeConversion;

public class TimeConversion {
    public static String timeConversion(String s) {
        String converted = hourConverter(s.substring(0, 2), s.substring(s.length() - 2, s.length()));
        return converted.concat(s.substring(2, s.length() - 2));

    }

    private static String hourConverter(String hour, String period) {
        if (period.equals("PM") && Integer.parseInt(hour) != 12) {
            return String.valueOf(Integer.parseInt(hour) + 12);
        }
        if (period.equals("AM") && Integer.parseInt(hour) == 12) {
            return "00";
        }
        return hour;
    }
}
