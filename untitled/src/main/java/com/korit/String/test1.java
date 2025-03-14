package com.korit.String;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //대소문자 바꾸기
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        //키 -
        for (int i = 0; i < str.length(); i++) {
            char ch =  str.charAt(i);
            if('A' <= ch && ch<= 'Z') System.out.println((char) ('a' + ch- 'A'));
            else System.out.println((char) 'A' + ch -'a');
        }

    }
}
