package task1;

public class Task1 {
    public static void main(String[] args){

        int[] A = new int[5];

        for (int i = 0; i < A.length; i++){
            A[i] = i;
            System.out.println("A[" + A[i] + "] = " + A[i]);
        }

        System.out.println(" ");

        for (int i = A.length - 1; i >= 0; i--){

            System.out.println("A[" + A[i] + "] = " + A[i]);
        }

        }
    }

