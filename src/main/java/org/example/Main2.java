package org.example;

import  java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число:");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число:");
        int num2 = scanner.nextInt();

        System.out.print("Действие");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        float sum;

        switch (action) {
            case "+" -> {
                sum = num1 + num2;
                System.out.println(sum);
            }
            case "-" -> {
                sum = num1 - num2;
                System.out.println(sum);
            }
            case "*" -> {
                sum = num1 * num2;
                System.out.println(sum);
            }
            case "/" -> {
                if (num2 == 0)
                    System.out.println("Eror");
                else {
                    sum = (float) num1 / num2;
                    System.out.println(sum);
                }
            }
            default -> System.out.println("Что-то пошло не так!");
        }


    }
}