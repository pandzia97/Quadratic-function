package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;
        double rootDelta = Math.sqrt(delta);

        if (delta < 0) {
            System.out.println("No zeros");
        } else if (delta == 0) {
            double x0 = -b / 2 * a;
            System.out.println(x0);
        } else if (delta > 0) {
            double x1 = -b - rootDelta / 2 * a;
            double x2 = -b + rootDelta / 2 * a;
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
