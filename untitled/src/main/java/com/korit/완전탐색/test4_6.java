package com.korit.완전탐색;

import java.util.Scanner;

public class test4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num  = 666; 
        int count =1;
        while (count != n){
            num++;
            if(String.valueOf(num).equals("666"))
                count++;
        }
        System.out.println(num);
    }
}
