package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Ex_1();
        //Ex_2();
        // Ex_3();
        //Ex_4();
        //Ex_5();
        // Ex_6();
        //Ex_7();
        // task1();
        //Ex_8();
        // Ex_9();
        Ex_10();
        //Ex_11();
    }

    private static void Ex_1() {
        int a = 12345679, res;
        for (int i = 9; i <= 81; i += 9) {
            res = a * i;
            System.out.println("Result: " + res);
        }
    }

    private static void Ex_2() {
        for (int i = 7; i <= 7; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }

    private static void Ex_3() {
        double a;
        for (int i = 2; i <= 20; i++) {
            a = Math.sin(Math.toRadians(i));
            System.out.println(a);
        }
    }

    private static void Ex_4() {
        double ch, zn, dr, res, x = 2.0;
        int factorial, sign = +1;

        for (int k = 1; k <= 13; k += 2) {
            ch = Math.pow(x, k);

            factorial = 1;
            for (int i = 2; i <= k; i++) {
                factorial *= 1;
            }

            zn = factorial;

            dr = ch / zn;

//             res=res+sign*dr;
            sign *= -1;

        }
    }

    private static void Ex_5() {
        double a = -5;
        double b = 4;
        double h = 0.23, x;
        double res;
        for (x = a; a < b; x += h) {
            if (Math.cos(x) != 0) {
                res = Math.tan(x);

                System.out.println("\n F(%.2f)=%.3f " + x + res);
            }
            System.out.println("ctg(x+1) " + x);

        }
    }

    public static void task1() {
        System.out.println("\nTask 1:" + System.lineSeparator());
        final double A = -5, B = 7, H = 0.75;
        System.out.printf("%4s%10s%10s%10s\n-----------------------------------\n", "X", "а)", "б)", "в)");
        for (double x = A; x <= B; x += H) {
            System.out.printf("%5.2f%10.2f%10.2f%10.2f\n", x, (x - Math.sin(x)), Math.pow(Math.sin(x), 2), 2 * Math.cos(x) - 1);
        }
    }
// Составить программу для вычисления значений функции
//F (x) на отрезке
//[ a, b] с шагом h. Результат представить в виде таблицы, первый столбец которой —
//значения аргумента, второй — соответствующие значения функции.

    private static void Ex_6() {
        double a = -5;
        double b = 7;
        double h = 0.75, x;
        double res_1, res_2, res_3;
        for (x = a; a <= b; x += h) {
            if (Math.sin(x) != 0) {
                res_1 = x - Math.sin(x);
                System.out.println("\nx = " + x + " , y = " + String.format("%.2f", res_1));

                res_2 = Math.pow(Math.sin(x), 2) * x;
                System.out.println("\n x = " + x + " , y = " + String.format("%.2f", res_2));
            }
            if (Math.cos(x) != 0) {
                res_3 = 2 * Math.cos(x) - 1;
                System.out.println("\nx = " + x + " , y = " + String.format("%.2f", res_3));
            }
        }
    }

    //Написать программу вычисления функции
//при a=3 b=-5 Аргумент x
//принимает значения от 1 до 5 с шагом 0,5.
    private static void Ex_7() {
        System.out.println("\nTask 2: " + System.lineSeparator());
        int a = 3;
        int b = -5;
        int x;
        double h = 0.5, y;
        System.out.println("Enter x (from 1 to 5): ");
        x = scanner.nextInt();
        for (x = 1; x <= 5; x += h) {
            if (x != 0) {
                y = a * Math.pow(x, 2) + b;
                System.out.println("y= " + y);
            }
        }
    }

    //Дано натуральное число. Верно ли, что цифра а встречается в нем реже, чем цифра b?
    public static void Ex_8() {
        System.out.println("\nTask 3: Дано натуральное число. Верно ли, что цифра а встречается в нем реже, чем\n" +
                "цифра b?" + System.lineSeparator());

        int number = 1232262855, a = 2, b = 5, digits = (int) Math.ceil(Math.log10(number)), mod = 0,
                counterA = 0, counterB = 0;
        int number1 = number;

        System.out.println(digits);
        for (int i = 0; i < digits; i++) {
            System.out.print(" " + (mod = number % 10));
            number /= 10;
            if (mod == a)
                counterA++;
            else if (mod == b)
                counterB++;
        }
        System.out.printf("\n%sВерно, что цифра %d встречается в нем реже, чем цифра %d\n\n", (counterA < counterB ? "" : "НЕ "), a, b);

        counterA = counterB = 0;
        do {
            System.out.print(" " + (mod = number1 % 10));
            if (mod == a)
                counterA++;
            else if (mod == b)
                counterB++;
            number1 /= 10;
        } while (number1 > 0);
        System.out.printf("\n%sВерно, что цифра %d встречается в нем реже, чем цифра %d", (counterA < counterB ? "" : "НЕ "), a, b);
    }

    //Найти 15 первых натуральных чисел, делящихся нацело на 19 и больших 100.
    private static void Ex_9() {
        final int DIVIDER = 19, COMPARER = 100;
        int number = COMPARER + 1;
        for (int n = 0; n < 15; ) {
            if (number % DIVIDER == 0) {
                System.out.print(number + " ");
                n++;
            }
            number++;
        }

        System.out.println();
        number = COMPARER + 1;
        int n = 0;
        while (n < 15) {
            if (number % DIVIDER == 0) {
                System.out.print(number + " ");
                n++;
            }
            number++;
        }
    }

    //Найти 20 первых натуральных чисел, делящихся нацело на 13 или на 17 и больших 500.
    private static void Ex_10() {
        int i=0, n;
        while (i < 20) {
            System.out.println("натуральные числа, делящихся нацело на 13 или на 17 и больших 500 : ");
            for (n = 0; n <= 500; n++) {
                if (n % 13 == 0 || n % 17 == 0) {
                    System.out.println("n " + n);

                }
            }
        }
    }
}




