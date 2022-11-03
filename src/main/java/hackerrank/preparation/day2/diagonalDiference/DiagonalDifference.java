package hackerrank.preparation.day2.diagonalDiference;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumA = 0;
        int sumB = 0;
        int arrSize = arr.size();

        for (int i = 0; i < arrSize; i++) {
            sumA += arr.get(i).get(i);
            sumB += arr.get(arrSize - 1 - i).get(i);
        }

        return Math.abs(sumA - sumB);

    }
}
