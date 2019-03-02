package com.company;

/**
 * Created by roi on 3/2/2019.
 */
public class Function {
    public static void main(String[] args) {
        int x=1,y=5;
        int summa = sum(x,y);
        //System.out.println(summa);
        System.out.println(fact(5));
    }
    static int sum(int a,int b){
        int s = a + b;
        return s;
    }

    static int fact(int x){
        int n=1;
        for (int i = 1; i <=x ; i++) {
            n*=i;
        }
        return n;
    }

    static int arrSum(int[] arr){
        int x =0;
        for (int i = 0; i <arr.length ; i++) {
            x+=arr[i];
        }
        return x;
    }
}
