package com.korit.array;


import java.util.Scanner;

class Main
{//10431 줄세우기
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int p=0;
        while (p-- >0){
            int t = sc.nextInt();
            int[] a = new int[20];
            for (int i = 0; i < 20; i++) {
                a[i] = sc.nextInt();
            }
            int cnt = 0;
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < i; j++) {
                    int myH = a[i];
                    for (int k = i; k > j; k--) {
                        a[k] = a[k-1];
                        cnt++;
                    }
                    a[j] = myH;
                    break;
                }
            }
            System.out.println(t+" "+cnt);
        }
    }
}

