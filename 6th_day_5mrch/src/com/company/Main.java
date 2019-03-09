package com.company;

public class Main {

    public static void main(String[] args) {
        String s = "21 22 18 23 24 20 20";
        double sum = 0;
        String[] arr;
        arr = s.split(" ");//Разбиваем строку по пробелам
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            int temp = Integer.valueOf(str);//valueOf возвращает число, которое записано в str
            sum += temp;
        }
        System.out.println(sum/7);
    }
}
