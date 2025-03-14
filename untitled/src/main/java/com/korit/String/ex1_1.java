package com.korit.String;

import java.util.Scanner;

public class ex1_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();
        char ch ;
        ch = str.charAt(num -1);
        System.out.println(ch);
    }
}
