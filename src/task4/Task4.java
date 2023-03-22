package task4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        Random randomizer = new Random();

        int[] A = new int[12];

        for (int i = 0; i < A.length; i++) {
            A[i] = randomizer.nextInt(30) - 20;
            if (A[i] < 0) {
                A[i] = 0;
            }
            System.out.println("A[" + i + "] = " + A[i]);
        }
    }
}
