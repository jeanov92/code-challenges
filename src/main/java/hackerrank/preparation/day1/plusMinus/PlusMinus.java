package hackerrank.preparation.day1.plusMinus;

import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        float negative = 0;
        float positive = 0;
        float zero = 0;
        int elements = arr.size();

        for (int num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        if (elements > 0) {
            System.out.println(positive / elements);
            System.out.println(negative / elements);
            System.out.println(zero / elements);
        }


    }
}
