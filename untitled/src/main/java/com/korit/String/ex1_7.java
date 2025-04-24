package com.korit.String;

import java.util.Scanner;

public class ex1_7 {//2908백준

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuffer s = new StringBuffer(sc.next());
        StringBuffer n =new StringBuffer(sc.next());

       int a = Integer.parseInt(s.reverse().toString());
       int b = Integer.parseInt(n.reverse().toString());
        System.out.println(Math.max(a,b));
    }
}
