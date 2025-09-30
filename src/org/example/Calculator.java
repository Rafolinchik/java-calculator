package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double answer = null;

        Double number1 = null;
        while (number1 == null) {
            System.out.println("Введите первое число:");
            String number = scanner.nextLine();
            try {
                number1 = Double.parseDouble(number.trim());
            } catch (NumberFormatException e) {
                System.out.println("Это не число. Попробуйте ещё раз.");
            }
        }

        Double number2 = null;
        while (number2 == null) {
            System.out.println("Введите второе число:");
            String number = scanner.nextLine();
            try {
                number2 = Double.parseDouble(number.trim());
            } catch (NumberFormatException e) {
                System.out.println("Это не число. Попробуйте ещё раз.");
            }
        }

        System.out.println("Введите операцию (+ - * /):");
        char operation = 0;
        while (operation == 0) {
            String s = scanner.nextLine().trim();
            if (s.isEmpty()) {
                System.out.println("Пустой ввод. Повторите (+ - * /):");
                continue;
            }
            char op = s.charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                operation = op;
            } else {
                System.out.println("Неизвестная операция. Разрешено: + - * /. Повторите:");
            }
        }

        if (operation == '/') {
            while (number2 == 0) {
                System.out.println("На ноль делить нельзя. Введите второе число снова:");
                String number = scanner.nextLine();
                try {
                    number2 = Double.parseDouble(number.trim());
                } catch (NumberFormatException e) {
                    System.out.println("Это не число. Попробуйте ещё раз.");
                }
            }
        }

        switch (operation) {
            case '+' -> answer = number1 + number2;
            case '-' -> answer = number1 - number2;
            case '*' -> answer = number1 * number2;
            case '/' -> answer = number1 / number2;
        }

        System.out.println("Ответ: " + answer);
        scanner.close();
    }
}