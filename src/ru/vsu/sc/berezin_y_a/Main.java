package ru.vsu.sc.berezin_y_a;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        System.out.print("Enter x: ");
        double x = readDouble();

        System.out.print("Enter n: ");
        int n = readInt();

        System.out.print("Enter e: ");
        double e = readDouble();

        System.out.print("1) ");
        System.out.println(findFirstSum(x, n));

        System.out.print("2) ");
        System.out.println(findSecondSum(x, n, e));

        System.out.print("3) ");
        System.out.println(findThirdSum(x, n, e));

        System.out.print("4) ");
        System.out.println(findFourthSum(x));

    }

    private static double readDouble() {
        Scanner scn = new Scanner(System.in);
        return scn.nextDouble();
    }

    private static int readInt() {
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }

    private static double raiseNum(double num, double degree) {
        double num0 = num;
        for (int i = 1; i < degree; i++) {
            num *= num0;
        }
        return num;
    }

    private static double returnNumModule(double x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    private static double findFirstSum(double x, int n) {
        double sum = 1;
        for (int i = 1; i < n; i++) {
            sum += ((((i + 1) * (i + 2)) / 2) * raiseNum(x, i) * raiseNum(-1, i));
        }
        return sum;
    }

    private static double findSecondSum(double x, int n, double e) {
        double sum = 0;
        int count = 0;
        if (1 > e) {
            sum++;
        }
        for (int i = 1; count < n; i++) {
            if (returnNumModule(((((i + 1) * (i + 2)) / 2) * raiseNum(x, i) * raiseNum(-1, i))) > e) {
                sum += ((((i + 1) * (i + 2)) / 2) * raiseNum(x, i) * raiseNum(-1, i));
                count++;
            }
        }
        return sum;
    }

    private static double findThirdSum(double x, int n, double e) {
        double sum = 0;
        int count = 0;
        if (1 > e) {
            sum++;
        }
        for (int i = 1; count < n; i++) {
            if (returnNumModule(((((i + 1) * (i + 2)) / 2) * raiseNum(x, i) * raiseNum(-1, i))) > (e / 10)) {
                sum += ((((i + 1) * (i + 2)) / 2) * raiseNum(x, i) * raiseNum(-1, i));
                count++;
            }
        }
        return sum;
    }

    private static double findFourthSum(double x) {
        return 1 / Math.pow((1 + x), 3);
    }

}
