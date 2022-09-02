package fundamentals.thirdTask;


import java.util.LinkedHashMap;
import java.util.Map;

public class TangentRange {
    private static final double eps = 0.0001;

    public static Map<Double, Double> calculate(double a, double b, double h) {
        Map<Double, Double> result = new LinkedHashMap<>();
        for (var i = a; i <= b - eps; i += h) {
            result.put(i, Math.tan(i));
        }
        result.put(b, Math.tan(b));
        return result;
    }
}
