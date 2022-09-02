package FirstTask;

import static java.lang.Math.abs;
import static java.lang.Math.sin;

public class FormulaExpression {

    public static double Calculate(double x, double y) {
        double sum=x+y;
        double sinus=sin(sum);
        double numerator = 1+ sinus*sinus;
        double denominator = 2+abs(x- (2*x)/(1+x*x*y*y));
        return numerator/denominator+x;
    }
}
