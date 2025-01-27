public class Cricketer implements Batsman, Bowler, Fielder {
    @Override
    public void bat() {
        System.out.println("Batting...");
    }

    @Override
    public void hitBoundary() {
        System.out.println("Hitting a Boundary...");
    }

    @Override
    public void takeRun() {
        System.out.println("Taking a Run...");
    }

    @Override
    public void bowl() {
        System.out.println("Bowling...");
    }

    @Override
    public void throwBall() {
        System.out.println("Throwing Ball...");
    }

    @Override
    public void catchBall() {
        System.out.println("Catching Ball...");
    }

}
