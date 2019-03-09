package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by roi on 3/5/2019.
 */
public class WithFiles {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("Products.txt");
        System.out.println(f.getName());
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            System.out.println(arr[1]+" costs "+arr[3]);
        }
    }
}
