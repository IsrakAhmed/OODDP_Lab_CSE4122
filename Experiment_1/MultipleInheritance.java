/* 

    1. Demonstrate Multiple Interface/Inheritance.
    
    Write a Java program to demonstrate multiple interface/inheritance.
    You are free to choose any application for showcasing multiple interface/inheritance.

*/


interface Batsman {
    void bat();

    void hitBoundary();

    void takeRun();
}

interface Bowler {
    void bowl();
}

interface Fielder {
    void throwBall();

    void catchBall();
}

class Cricketer implements Batsman, Bowler, Fielder {
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

public class MultipleInheritance {
    public static void main(String[] args) {
       
        Cricketer israk = new Cricketer();

        israk.bat();
        israk.hitBoundary();
        israk.takeRun();
        israk.bowl();
        israk.throwBall();
        israk.catchBall();
    }
}
