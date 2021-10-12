package com.company.dymrin3;

import java.util.Arrays;

public class Main {
    /*
      Создать класс Person у котороего есть 3 поля - фамилия, имя, отчество.
      Создать 2 конструктора - одни на все поля, во второй задается строка типа "Иванов Иван Иванович",
      он ее должен распарсить и задать значения полям.
    */

    public static void main(String[] args) {
        String fullName = "Иванов Иван Иванович";
        String[] parts = fullName.split(" ");
        String surname = parts[0];
        String firstName = parts[1];
        String patronymic = parts[2];

        Person ivan = new Person(surname, firstName, patronymic);

        System.out.println(ivan);

        System.out.println(Arrays.toString(newArray()));
    }

    public static int[] newArray() {
        /*
        Задан массив случаных чисел типа int в котором есть положительные и отрицательные числа.
        Написать метод который вернет массив квадратов этих чисел, отсортированных по возрастанию.
        */
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 20) - 10);
            array[i] *= array[i];
        }
        Arrays.sort(array);
        return array;

    }


}
