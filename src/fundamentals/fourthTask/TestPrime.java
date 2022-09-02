package fundamentals.fourthTask;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class TestPrime {
    public static List<Integer> definePrimes(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]))
                result.add(i);
        }
        return result;
    }

    private static boolean isPrime(int number) {
        if (number < 2)
            return false;
        int sqrtNumber = (int) sqrt(number);
        for (int i = 2; i <= sqrtNumber; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
