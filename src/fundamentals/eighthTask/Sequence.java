package fundamentals.eighthTask;

import java.util.ArrayList;
import java.util.List;

public class Sequence {

    public static List<Integer> getPositions(double[] arr1, double[] arr2){
        if (arr1==null || arr2==null)
            throw new NullPointerException("arr1 or arr2 is null");
        List<Integer> result= new ArrayList<>();
        for (double v : arr2) {
            int j = 0;
            while (j < arr1.length) {
                if (v < arr1[j]) {
                    result.add(j);
                    break;
                }
                j++;
            }
            if (j == arr1.length) {
                result.add(j);
            }
        }

        return result;
    }

}
