package com.korit.완전탐색;

import java.util.Scanner;

public class try4 {//진법 변환
    public static boolean isPalramoe(int x, int base){
        int[] digit = new int[20];
        int len =0;
        while (x > 0){
            digit[len++] =x %base;
        }
        for (int i = 0; i < len/2; i++) {
            if(digit[i] != digit[len-i-1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        while (t-- > 0){
            int x =sc.nextInt();
            boolean ans =false;
            for (int i = 2; i <65 ; i++) {
                if(isPalramoe(x,i)){
                    ans =true;
                    break;
                }
            }
            System.out.println(ans ? 1:0);
        }
    }

}
