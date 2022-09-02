package fundamentals.FifthTask;

import java.util.ArrayList;
import java.util.List;

public class SubsetFinder {
    public static List<Integer> find(int[] arr) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    arr[j] = 0;
                }
            }
        return result;
    }
}
