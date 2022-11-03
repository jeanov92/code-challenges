package hackerrank.preparation.day2.countingSort1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {
        int[] frequencyArr = new int[100];

        for (Integer num : arr) {
            int count = frequencyArr[num];
            frequencyArr[num] = count + 1;
        }

        return Arrays.stream(frequencyArr).boxed().collect(Collectors.toList());
    }
}
