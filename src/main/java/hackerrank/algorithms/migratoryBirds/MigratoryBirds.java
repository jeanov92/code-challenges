package hackerrank.algorithms.migratoryBirds;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get(i);
            if (map.get(value) == null) {
                map.put(value, 1);
            } else {
                map.put(value, map.get(value) + 1);
            }
        }

        int max = map.entrySet().stream().map(entry -> entry.getValue()).max(Comparator.naturalOrder()).get();
        int lowestType = map.entrySet().stream()
                .filter(entry -> entry.getValue() == max).map(entry -> entry.getKey()).min(Comparator.naturalOrder()).get();
        return lowestType;
    }
}
