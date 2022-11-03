package hackerrank.preparation.day1.miniMaxSum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        long maxSum = 0;
        long minSum = 0;
        ArrayList<Integer> sortedArr = (ArrayList) ((ArrayList) arr).clone();
        ArrayList<Integer> reverseSortedArr = (ArrayList) ((ArrayList) arr).clone();

        sortedArr.sort(Comparator.naturalOrder());
        reverseSortedArr.sort(Comparator.reverseOrder());

        for (int i = 0; i < sortedArr.size() - 1; i++) {
            minSum += sortedArr.get(i);
        }

        for (int i = 0; i < reverseSortedArr.size() - 1; i++) {
            maxSum += reverseSortedArr.get(i);
        }

        System.out.println(minSum + " " + maxSum);
    }

}
