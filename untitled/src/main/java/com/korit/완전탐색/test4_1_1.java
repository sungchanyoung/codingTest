package com.korit.완전탐색;

import java.util.Scanner;

public class test4_1_1 {// 백준10448
    static boolean[] isNurekaCount =  new boolean[1001];

    public static void preprocess(){
        int[] triangleNumbers = new int[50];
        int triangleNumberCount =0;
        for (int i = 0; ; i++) {
            int triangleNumber = i *(i+1)/2;
            if(triangleNumber >1000)break;
            triangleNumbers[triangleNumberCount++] =triangleNumber;

        }
        for (int i = 0; i <triangleNumberCount ; i++) {
            for (int j = 0; j < triangleNumberCount; j++) {
                for (int k = 0; k < triangleNumberCount; k++) {
                    int enurekaNumber =  triangleNumbers[i]+ triangleNumbers[j]+ triangleNumbers[k];
                    if (enurekaNumber> 1000) break;
                    isNurekaCount[enurekaNumber]=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        preprocess();
        Scanner sc=  new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int k= sc.nextInt();
            System.out.println(isNurekaCount[k]? "1" : "0");
        }
    }
}
