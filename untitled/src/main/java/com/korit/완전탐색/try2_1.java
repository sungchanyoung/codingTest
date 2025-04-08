package com.korit.완전탐색;

import java.util.Scanner;

public class try2_1 {//영화 감독 다른 풀이

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n >1){
            func(n);
        }else{
            System.out.println(666);
        }
    }
    public static void func(int n){
        int count =1;
        int prev_digit = 0; //선수 자릿수
        int num = 0; // 선수 자릿ㅇ를 제외한 나머지 뒷 자리수
        //prev_digit 기준으로 표현한다 num 0,600,660,666
        while (true){
            if(((prev_digit % 10000)/ 10) == 666 && prev_digit % 10 != 6){
                for (int i = 0; i < 1000; i++) {
                    if(count == n){
                        System.out.println(prev_digit * 1000 + num);
                        return;
                    }
                    num++;
                    count++;
                }
                prev_digit++;
            } else if (prev_digit %1000 == 666) {
                num =0;
                for (int i = 0; i < 1000; i++) {
                    if(count == n){
                        System.out.println(prev_digit *1000 + num);
                        return;
                    }
                    count++;
                    num++;
                }
                prev_digit++;
            } else if (prev_digit % 10 == 6) {
                num =660;
                for (int i = 0; i < 10; i++) {
                   if(count == n){
                       System.out.println(prev_digit * 1000 + num);
                       return;
                   }
                    num++;
                    count++;
                }
                prev_digit++;
            }else {
                num =666;
                if(count == n){
                    System.out.println(prev_digit * 1000 + num);
                    return;
                }
                count++;
                prev_digit++;
            }

        }
    }

}
