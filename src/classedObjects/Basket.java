package classedObjects;

public class Basket {
    private final Ball[] balls;
    private double weight;

    public Basket(Ball[] balls) {
        this.balls = balls;
    }

    public double getBallsWeight() {
        if (weight == 0) {
            for (var element : balls) {
                weight += element.getWeight();
            }
        }
        return weight;
    }

    public int getCountBallsColor(Color color) {
        int result = 0;
        for (var element : balls) {
            if (element.getColor() == color)
                result++;
        }
        return result;
    }
}
