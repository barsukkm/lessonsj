package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp3 {

    public static void main(String[] args) {
        myTask1();
        myTask2();
        myTask3();
        myTask4("Geekbrains", 5);

    }

    public static void myTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println((boolean) (10 <= a + b && a + b <= 20));
    }


    public static void myTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        int a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void myTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        int a = scanner.nextInt();
        System.out.println((boolean) (a < 0));
    }

    public static void myTask4(String word, int a) {
        String[] arr = new String[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = word;
            System.out.print(arr[i] + " ");
        }
    }
}
