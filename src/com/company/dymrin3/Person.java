package com.company.dymrin3;

public class Person {
    /*
      Создать класс Person у котороего есть 3 поля - фамилия, имя, отчество.
      Создать 2 конструктора - одни на все поля, во второй задается строка типа "Иванов Иван Иванович",
      он ее должен распарсить и задать значения полям.
        */
    private String surname;
    private String firstName;
    private String patronymic;


    public Person(String surname, String firstName, String patronymic) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }


}
