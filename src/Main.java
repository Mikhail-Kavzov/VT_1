import classedObjects.*;
import classedObjects.Comparators.BookAuthorComparator;
import classedObjects.Comparators.BookPriceComparator;
import classedObjects.Comparators.BookTitleComparator;
import fundamentals.eighthTask.Sequence;
import fundamentals.fifthTask.SubsetFinder;
import fundamentals.firstTask.FormulaExpression;
import fundamentals.fourthTask.TestPrime;
import fundamentals.secondTask.Region;
import fundamentals.seventhTask.Sorter;
import fundamentals.sixthTask.Matrix;
import fundamentals.thirdTask.TangentRange;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    private static void ComparatorConfig(Comparator<Book> bookComparator) {

        TreeSet<Book> bookSet = new TreeSet<>(bookComparator);
        bookSet.add(new Book("Name1", "Author3", 16, 2, 5));
        bookSet.add(new Book("Name4", "Author2", 154, 1, 1));
        bookSet.add(new Book("Name3", "Author2", 15, 3, 2));
        bookSet.add(new Book("Name2", "Author4", 17, 1, 4));
        bookSet.forEach(System.out::println);
        System.out.println("----------------------------------------------------------");
    }

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

        System.out.println("----------------------------TASK 6 -----------------------------");
        var matrix = Matrix.get(new double[]{5, 6, 7, 9, 11, 2});
        for (var item : matrix) {
            System.out.println(Arrays.toString(item));
        }

        System.out.println("----------------------------TASK 7 -----------------------------");
        var arr = new double[]{5, 7, 9, 11, 2, -5, -53, 20, -6};
        Sorter.sortShell(arr);
        System.out.println("Sort :" + Arrays.toString(arr));

        System.out.println("----------------------------TASK 8 -----------------------------");
        System.out.println("Positions to insert elements of the 2nd sequence into the 1st: ");
        var arrPos = Sequence.getPositions(new double[]{5, 5, 6, 8, 11, 20}, new double[]{4, 5, 7, 11, 12, 56, 80});
        arrPos.forEach(value -> System.out.print(value + " "));
        System.out.println();

        System.out.println("----------------------------TASK 9 -----------------------------");
        var balls = new Ball[]{
                new Ball(Color.BLUE, 5.7),
                new Ball(Color.RED, 10.4),
                new Ball(Color.BLUE, 4.3),
                new Ball(Color.GREEN, 4.6)};

        var basket = new Basket(balls);
        System.out.println("Weight: " + basket.getBallsWeight() + " BlueCount: " + basket.getCountBallsColor(Color.BLUE));

        System.out.println("----------------------------TASK 12 -----------------------------");
        Book book1 = new Book("Name1", "Author1", 15, 2);
        Book book2 = new Book("Name2", "Author2", 19, 1);
        Book book3 = new Book("Name3", "Author3", 15, 2);
        System.out.println(book1.equals(book2));
        System.out.println(book3.equals(book1));
        System.out.println(book3.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book2.toString());

        System.out.println("----------------------------TASK 13 -----------------------------");
        Book programmerBook1 = new ProgrammerBook("en", 5);
        Book programmerBook2 = new ProgrammerBook("ru", 2);
        Book programmerBook3 = new ProgrammerBook("en", 5);
        System.out.println(programmerBook1.equals(programmerBook2));
        System.out.println(programmerBook3.equals(programmerBook1));
        System.out.println(programmerBook3.hashCode());
        System.out.println(programmerBook1.hashCode());
        System.out.println(programmerBook2.toString());

        System.out.println("----------------------------TASK 15 -----------------------------");
        ComparatorConfig(null);

        System.out.println("----------------------------TASK 16 -----------------------------");
        System.out.println("Sort by Title: ");
        ComparatorConfig(new BookTitleComparator());
        System.out.println("Sort by Title -> Author: ");
        ComparatorConfig(new BookTitleComparator().thenComparing(new BookAuthorComparator()));
        System.out.println("Sort by Author -> Title: ");
        ComparatorConfig(new BookAuthorComparator().thenComparing(new BookTitleComparator()));
        System.out.println("Sort by Author->Title->Price: ");
        ComparatorConfig(new BookAuthorComparator().thenComparing(new BookTitleComparator()).thenComparing(new BookPriceComparator()));
    }
}
