package com.korit.String;

import java.util.Scanner;

public class test1_5 {
    public static void main(String[] args) {
        //소금 공장
        Scanner sc= new Scanner(System.in);
        //현재 시간
        String current = sc.next();
        // 투하 시간
        String drop = sc.next();
        //시간을 :뺴고 정수로 변환 -> 게산하기 쉽게 총시간 분 초 다 더해서 총 초를 구하는 코드

        String[] currentUnit = current.split(":");
        int currentHour =  Integer.parseInt(currentUnit[0]);
        int currentMinute =  Integer.parseInt(currentUnit[1]);
        int currentSecond =  Integer.parseInt(currentUnit[2]);
        int currentAmount = currentHour*3600+ currentMinute*60 +currentSecond;

        String[] dropUnit = drop.split(":");
        int dropHour = Integer.parseInt(dropUnit[0]);
        int dropMinute = Integer.parseInt(dropUnit[1]);
        int dropSecond = Integer.parseInt(dropUnit[2]);
        int dropAmount = dropHour * 3600+ dropMinute * 60 + dropSecond;

        int needAmount =  dropAmount - currentAmount;
        if(needAmount <= 0){
            needAmount += 24 * 3600;
        }
        int needHour =  needAmount / 3600;
        int needMinute = (needAmount % 3600)/60;
        int needSecond =  needAmount % 60;
        System.out.printf("%02d:%02d:%02d",needHour, needMinute,needSecond);

    }
}
