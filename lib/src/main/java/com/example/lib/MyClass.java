package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入任意數字");

        int a = scanner.nextInt();

        for(int i=a;i>0;i--){

            for(int k=a-i ;k>0;k--){

                System.out.print(" ");

            }

            for (int j=i;j>0;j--){

                System.out.print("*");

            }

            System.out.println("");

        }

    }
}
