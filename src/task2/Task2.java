package task2;

import java.util.Random;

public class Task2 {
    public static void main(String[] args){

        Random randomizer = new Random();

        int[] A = new int[7];

        for (int i = 0; i < A.length; i++){
            A[i] = randomizer.nextInt(50) - 25;
            System.out.println("A[" + i + "] = " + A[i] * 2);
        }

        System.out.println(" ");

        for (int i = 0; i < A.length; i++){
            A[i] = A[i] * 2;
            System.out.println("A[" + i + "] = " + A[i]);
        }
    }
}
