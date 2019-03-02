package com.company;

/**
 * Created by roi on 3/2/2019.
 */
public class Task2 {
    public static void main(String[] args) {
        char[] symbols ={'8','a', 'o','1','y','4'};
        replace(symbols);
        System.out.println();

    }
    static void replace(char[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<'0' | arr[i]>'9'){
                arr[i]='*';
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }


}
