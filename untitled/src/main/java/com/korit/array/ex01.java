package com.korit.array;

import java.util.Arrays;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        int n= sc.nextInt(); 
        int[] a =  new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max,a[i]);
            min = Math.min(min,a[i]);
        }
        System.out.println(min+""+max);
    }
}
