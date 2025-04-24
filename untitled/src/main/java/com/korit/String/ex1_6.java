package com.korit.String;

import java.util.Scanner;

public class ex1_6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k = sc.nextInt();//총 횟수
        for (int i = 0; i < k; i++) {

            int s = sc.nextInt();
            String str =sc.next();
            for (int j = 0; j < str.length(); j++) {
                for (int l = 0; l < s; l++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
