package com.company;

import java.util.Scanner;

/**
 * Created by roi on 2/26/2019.
 */
public class NewTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum=0;
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            sum+=a[i];
        }
        double midHeight=sum/n;
        int count=0;
        for (int i = 0; i <n ; i++) {
            if(a[i]>midHeight){
                count++;
            }
        }
        System.out.println("1: Middle height: "+midHeight);
        System.out.println("2: Amount of people who > middle height:"+count);
    }
}
