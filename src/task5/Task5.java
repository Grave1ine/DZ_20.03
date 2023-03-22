package task5;

public class Task5 {
    public static void main(String[] args){

    User[] A = new User[5];

    for (int i = 0; i < A.length; i++){
        A[i] = new User();
        A[i].firstName = "name " + i;
        A[i].lastName = "lastName " + i;
        A[i].age = i;

        System.out.println(A[i].firstName);
        System.out.println(A[i].lastName);
        System.out.println(A[i].age);

    }

    }
}
    /*Создайте класс User с полями firstName, lastName и age. Создайте массив объектов класса User и с помощью цикла выведите на экран строки формата: “Last name:  <lastName>, name: <firstName> - <age>”.
    Для упрощения решения задачи: сначала создайте просто объект класса User, выведите на экран строку, а потом создавайте массив.
        P.S. Массив класса User создается точно также, как массив примитивного типа. Отличие в том, что элементом массива является объект, поэтому в записи:

        array[0] = user1;

        user1 является объектом (переменной) класса User. Не забудьте перед сохранением объекта в массив заполнить значения полей.*/