package com.company;

import java.util.Scanner;


/**
 * Created by roi on 2/19/2019.
 */
public class Main08EndlessCalc {
    public static void main(String[] args) {
        double out=0;
        while (0 < 1) {
            Scanner sc = new Scanner(System.in);
            if (out==0) {
                double a1 = sc.nextDouble();
                String op = sc.next();
                double a2 = sc.nextDouble();
                if (op.equals("+"))

                {
                    out = a1 + a2;
                } else if (op.equals("-"))

                {
                    out = a1 - a2;
                } else if (op.equals("*"))

                {
                    out = a1 * a2;
                } else if (op.equals("/"))

                {
                    out = a1 / a2;
                } else if (op.equals("^"))

                {
                    out = Main09Pow.chPow(a1, a2);
                }

            }else {
                String op = sc.next();
                double a2 = sc.nextDouble();
                if (op.equals("+"))

                {
                    out = out + a2;
                } else if (op.equals("-"))

                {
                    out = out - a2;
                } else if (op.equals("*"))

                {
                    out = out * a2;
                } else if (op.equals("/"))

                {
                    out = out / a2;
                } else if (op.equals("^"))

                {
                    out = Main09Pow.chPow(out, a2);
                }
            }

            System.out.println("result: " + out);
            System.out.println("Reset result?(`y` - yes, `n` - no)");
            String reset = sc.next();
            if (reset.equals("y")) {
                out = 0;
            }
            System.out.println("insert `s` to stop, `g` to continue");
            String stop = sc.next();
            if (stop.equals("s")) {
                break;
            }
        }
    }
}
