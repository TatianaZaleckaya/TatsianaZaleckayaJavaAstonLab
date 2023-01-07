package task3;

//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        checkNumberInArray();
    }

    private static void checkNumberInArray() {
        int[] array = createArray();

        for (int value : array) {
            if (value % 3 == 0) {
                System.out.println("Число" + value + "делится на 3");
            }
        }
    }

    private static int[] createArray() {
        int sizeArray = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите размер массива. Он будет заполнен случайными числами.");
            sizeArray = sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Необходимо ввести число");
        }
        Random random = new Random();
        int[] array = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            array[i] = random.nextInt(1000);
        }
        System.out.println("Созданный массив: " + Arrays.toString(array));
        return array;
    }
}
