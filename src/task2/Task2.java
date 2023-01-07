package task2;

import java.util.Scanner;

// Составить алгоритм: если введенное имя совпадает с Вячеслав,
// то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
public class Task2 {

    private static final String NAME = "Вячеслав";

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Введите имя: ");
            checkName(scn.nextLine());
        }
    }

    private static void checkName(String inputName) {
        //Если Важно учитывать регистр вводимых данных, то метод egualsIgnoreCase необходимо заменить
        // на метод eguals
        if (NAME.equalsIgnoreCase(inputName)) {
            System.out.println("Привет, " + NAME);
        } else {
            System.out.println("Нет такого имени.");
        }
    }
}
