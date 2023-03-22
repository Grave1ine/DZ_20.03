package task3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random randomizer = new Random();

        int[] A = new int[8];

        int caunter = 0;

        for (int i = 0; i < A.length; i++){
            A[i] = randomizer.nextInt(20) - 10;
            System.out.println("A[" + i + "] = " + A[i]);
            if (A[i] < 0){
                caunter++;
            }
        }
        System.out.print( "below zero: "+ caunter);
    }
}
