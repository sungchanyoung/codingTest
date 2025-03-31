package com.korit.완전탐색;

import java.util.Scanner;

public class try3 { //숫자를 진법으로 바꾸는 문제 진법변환2 11005
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(); //숫자
        int b = sc.nextInt(); //진법 숫자
        String ans ="";//기록 하는
        while (n >0){
            int d = n % b;
            if(d < 10) ans += d;
            else ans += (char)(d - 10 + 'A');
            n/=d;
        }
        for (int i = ans.length()-1; i >=0 ; i--) {
            System.out.print(ans.charAt(i));
        }
        System.out.println();
    }
}
