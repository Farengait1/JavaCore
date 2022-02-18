package Lesson1;

public class Water extends Obstacle {
    private int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitors competitor) {
        competitor.swim(distance);
    }
}
