package com.korit.완전탐색;

import java.util.Scanner;

public class try2 {//백준 영화감독 숌

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 1){
            func(n);
        }else{
            System.out.println(666);
        }
    }
    public static void func(int n){
        int count =1;
        int prev_digit = 0;
        int num = 0;
        while (true){
            //끝 4자리 앞의 666이고 마지막 자리가 6이 아님
            if(((prev_digit % 10000)/10) == 666 &&  prev_digit % 10 != 6){
                for (int i = 0; i < 10000; i++) {
                    if(count == n){
                        System.out.println(prev_digit * 1000 +num);
                        return;
                    }
                    count++;
                    num++;
                }
                prev_digit++;

            }
            //끝자리가 정확히 666
            else if (prev_digit % 10000 == 666) {
                num =0;
                for (int i = 0; i < 1000; i++) {
                    if(count == n){
                        System.out.println(prev_digit * 1000 + num);
                        return;
                    }
                    count++;
                    num++;
                }
                prev_digit++;

            }
            //끝자리가 6이면 666~675까지 추가 생성
            else if (prev_digit % 10 == 6) {
                num = 660;
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
                    System.out.println(prev_digit *1000 +num);
                    return;
                }
                count++;
                prev_digit++;
            }
        }
    }
}

