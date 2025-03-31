package com.korit.완전탐색;

import java.util.Scanner;

public class test4_2 {// 11005 진법 변환2

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//10진수 숫자
        int b = sc.nextInt();// 몇 진법

        //1. n을 b로 나눈 나머지를 구하고 b로 나누자
        //2. 이때 가장 마지막 나머지부터 가장 앞 자릿값이 된다.
        String ans = "";
        while(n >0){ // 몫이 0보다 클경우 -> 더이사 B진법으로 바꿀수 없을 경우
            int d= n %b;
            if(d <10) ans +=d; // 만약에 나누었을때 나머지가 10보다 작은경우
            else ans += (char)(d - 10 + 'A');
            n /=d;
        }
        for (int i = ans.length()-1; i >=0 ; i--) {
            System.out.print(ans.charAt(i));
        }
        System.out.println();
    }
}
