package fundamentals.fifthTask;

public class SubsetFinder {
    public static int find(int[] arr) {
        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                i++;
            } else {
                int k = i;
                while (k < arr.length && arr[k] <= arr[i - 1]) {
                    k++;
                }
                result += k - i;
                i = k;
            }
        }
        return result;
    }
}
