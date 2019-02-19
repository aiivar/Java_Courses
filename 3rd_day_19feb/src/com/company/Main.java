package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int out = 0;
        System.out.println("insert the number: ");
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        System.out.println("insert operation(+,-,*,/): ");
        String op = sc.next();
        System.out.println("insert the next number: ");
        int a2 = sc.nextInt();
        if (op.equals("+")) {
            out = a1 + a2;
        } else if (op.equals("-")) {
            out = a1 - a2;
        } else if (op.equals("*")) {
            out = a1 * a2;
        } else {
            out = a1 / a2;
        }
        System.out.println("result: " + out);
    }
}
