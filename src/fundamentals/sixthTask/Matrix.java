package fundamentals.sixthTask;

public class Matrix {
    public static double[][] get(double[] arr) {
        int len = arr.length;
        double[][] result = new double[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                result[i][j - i] = arr[j];

            }
            for (int j = 0; j < i; j++) {
                result[i][len - i + j] = arr[j];
            }
        }
        return result;
    }
}
