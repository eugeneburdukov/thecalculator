package com.company;

import java.util.Scanner;

public class Main {
    static double firstNumber, secondNumber;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;

        do {
            System.out.println("Enter: 1 - sum, 2 - minus, 3 - mult, 4 - devide, 5 - square, 0 - exit!");
            choose = scanner.nextInt();
            readNumbers(choose);

            switch (choose) {
                case 1:
                    System.out.println(sum(firstNumber, secondNumber));
                    break;
                case 2:
                    System.out.println(minus(firstNumber, secondNumber));
                    break;
                case 3:
                    System.out.println(mult(firstNumber, secondNumber));
                    break;
                case 4:
                    System.out.println(devide(firstNumber, secondNumber));
                    break;
                case 5:
                    System.out.println(square(firstNumber));
                    break;
                case 0:
                    System.out.println("Thank you for attention, bye!");
                    break;
                default:
                    System.out.println("Сделайте правильный выбор!");
            }

        } while (choose != 0);

    }

    private static double sum(double a, double b) {
        return a + b;
    }

    private static double minus(double a, double b) {
        return a - b;
    }

    private static double mult(double a, double b) {
        return a * b;
    }

    private static double devide(double a, double b) {
        return a / b;
    }

    private static double square(double a) {
        return a * a;
    }

    private static void readNumbers(int choose) {
        if (choose > 0 && choose < 6) {
            System.out.print("Enter a number: ");
            firstNumber = scanner.nextInt();
            if (choose != 5) {
                System.out.print("Enter a second number: ");
                secondNumber = scanner.nextInt();
            }
        }
    }
}
