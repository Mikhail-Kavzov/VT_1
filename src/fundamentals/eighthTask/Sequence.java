package fundamentals.eighthTask;

import java.util.ArrayList;
import java.util.List;

public class Sequence {

    public static List<Integer> getPositions(double[] arr1, double[] arr2){
        List<Integer> result= new ArrayList<>();
        for (int i=0; i<arr2.length; i++){
            int j=0;
            while (j<arr1.length){
                if (arr2[i]<arr1[j]){
                    result.add(j);
                    break;
                }
                j++;
            }
            if (j==arr1.length){
                result.add(j);
            }
        }

        return result;
    }

}
