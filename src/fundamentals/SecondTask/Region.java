package fundamentals.SecondTask;

public class Region {

    public static boolean isBelong(double x, double y) {
        return (x >= -6 && x <= 6) && (y >= -3 && y <= 0) || (x >= -4 && x <= 4) && (y >= 0 && y <= 5);
    }
}
