package hackerrank.algorithms.breakingTheRecords;

import java.util.Arrays;
import java.util.List;

public class BrakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min = scores.get(0);
        int max = scores.get(0);
        int minRecord = 0;
        int maxRecord = 0;
        for (Integer score: scores) {
            if(score < min) {
                min= score;
                minRecord++;
            } else if(score > max) {
                max= score;
                maxRecord++;
            }
        }

        return Arrays.asList(maxRecord, minRecord);
    }
}
