import classedObjects.Ball;
import classedObjects.Basket;
import classedObjects.Color;
import fundamentals.fifthTask.SubsetFinder;
import fundamentals.firstTask.FormulaExpression;
import fundamentals.fourthTask.TestPrime;
import fundamentals.secondTask.Region;
import fundamentals.seventhTask.Sorter;
import fundamentals.thirdTask.TangentRange;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------TASK 1 -----------------------------");
        System.out.println(FormulaExpression.calculate(10.71, 20.03));

        System.out.println("----------------------------TASK 2 -----------------------------");
        System.out.println(Region.isBelong(3, 3));

        System.out.println("----------------------------TASK 3 -----------------------------");
        System.out.println("X           Y");
        var map = TangentRange.calculate(5, 7, 0.3);
        map.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("----------------------------TASK 4 -----------------------------");
        var listPositions = TestPrime.definePrimes(new int[]{-1, 5, 3, 2, 7, 9, 11, 20});
        if (listPositions.isEmpty())
            System.out.println("No prime numbers");
        else {
            System.out.println("Positions: ");
            listPositions.forEach(index -> System.out.print(index + " "));
        }
        System.out.println();

        System.out.println("----------------------------TASK 5 -----------------------------");
        System.out.println("Exclude " + SubsetFinder.find(new int[]{5, 2, 6, 9, 22, 7, 17, 28}) + " elements");

        System.out.println("----------------------------TASK 7 -----------------------------");
        var arr=new double[]{5, 7, 9, 11, 2, -5, -53, 20, -6};
        Sorter.sortShell(arr);
        System.out.println("Sort :" + Arrays.toString(arr));

        System.out.println("----------------------------TASK 9 -----------------------------");

        var balls = new Ball[]{
                new Ball(Color.BLUE, 5.7),
                new Ball(Color.RED, 10.4),
                new Ball(Color.BLUE, 4.3),
                new Ball(Color.GREEN, 4.6)};

        var basket = new Basket(balls);
        System.out.println("Weight: " + basket.getBallsWeight() + " BlueCount: " + basket.getCountBallsColor(Color.BLUE));

    }
}
