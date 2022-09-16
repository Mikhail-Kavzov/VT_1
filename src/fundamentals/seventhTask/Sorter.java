package fundamentals.seventhTask;

public class Sorter {
    public static void sortShell(double[] arr) {
        if (arr==null)
            throw new NullPointerException("arr is null");
        for (int i = 0; i < arr.length - 1; ) {
            if (arr[i] <= arr[i + 1]) {
                i++;
            } else {
                double temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                if (i != 0)
                    i--;
            }
        }
    }
}
