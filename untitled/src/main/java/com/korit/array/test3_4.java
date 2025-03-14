package com.korit.array;

import java.util.Scanner;

public class test3_4 {
    // 두 수의 합 3273
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        boolean[] exist =  new boolean[1000001];
        for (int i = 0; i < n; i++) {
            exist[a[i]] = true;
        }
        int ans =0;
        for (int i = 0; i < n; i++) {
            int pairValue =  x-a[i];
            if (0<= pairValue && pairValue <= 1000000){
                ans += exist[pairValue] ? 1 : 0;
            }
        }
        System.out.println(ans/2);
    }
}
