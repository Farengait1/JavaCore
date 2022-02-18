package Lesson1;

public class Cross extends Obstacle {
    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitors competitor) {
        competitor.run(distance);
    }
}
