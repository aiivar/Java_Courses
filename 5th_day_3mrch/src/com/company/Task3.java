package com.company;

import java.util.Scanner;

/**
 * Created by roi on 3/2/2019.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String newStr = toUppercase(s);
        System.out.println(newStr);
    }

    static String toUppercase(String s){
        char [] sym = s.toCharArray();
        for (int i = 0; i <sym.length ; i++) {
            if (sym[i]>'Z'){
                sym[i]=(char)(sym[i]-32);
            }
        }
        String Str= new String(sym);

        return Str;
    }
}
