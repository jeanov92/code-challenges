package hackerrank.preparation.day2.lonelyNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LonelyNumber {
    public static int lonelyinteger(List<Integer> a) {
        int lonelyInteger = 0;
        List<Integer> existing = new ArrayList<>();

        if (a.size() == 1) {
            return a.get(0);
        }

        for (int i = 0; i <= a.size() - 1; i++) {

            if (existing.contains(a.get(i))) {
                continue;
            }

            for (int j = i + 1; j < a.size(); j++) {
                if (Objects.equals(a.get(i), a.get(j))) {
                    existing.add(a.get(i));
                    break;
                }
            }

            if (!existing.contains(a.get(i))) {
                lonelyInteger = a.get(i);
            }
        }

        return lonelyInteger;

    }
}
