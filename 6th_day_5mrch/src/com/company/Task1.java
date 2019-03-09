package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by roi on 3/5/2019.
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("Products.txt");
        int damage = 0;
        System.out.println(f.getName());
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            int amount = Integer.valueOf(arr[2]);
            int cost = Integer.valueOf(arr[3]);
            damage += amount * cost;
        }
        System.out.println("Damage to our economy: " + damage);
    }
}
