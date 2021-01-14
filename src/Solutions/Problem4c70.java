package Solutions;

import java.util.Random;

public class Problem4c70 extends Problem{
    @Override
    public void runProblem(String[] args) {
        Random generator = new Random();
        final int MAXIMUM = 49; //

        for (int i = 1; i < 7; i++){
            System.out.println("Number 1: " + Integer.toString(generator.nextInt(MAXIMUM) + 1));
        }
        System.out.println("Bonus Number: " + Integer.toString(generator.nextInt(MAXIMUM) + 1));
    }
}
