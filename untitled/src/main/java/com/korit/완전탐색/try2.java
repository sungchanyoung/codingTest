package com.korit.완전탐색;

import java.util.Scanner;

public class try2 {
    //유레카 문제
    static boolean[] isEurekaNumber = new boolean[1001];

    public static void preprocess(){
        int[] triaingleNumbers = new int[50];
        int triangleNumberCount = 0;
        for (int i = 0; ; i++) {
            int triangleNumber = i * (i+1)/2;
            if(triangleNumber > 1000) break;
            triaingleNumbers[triangleNumberCount++] = triangleNumber;
        }
        for (int i = 0; i < triangleNumberCount; i++) {
            for (int j = 0; j < triangleNumberCount; j++) {
                for (int k = 0; k < triangleNumberCount; k++) {
                    int eurekaNumber = triaingleNumbers[i] + triaingleNumbers[j] +  triaingleNumbers[k];
                    if(eurekaNumber > 1000) break;
                    isEurekaNumber[eurekaNumber++] =true;
                }
            }
        }
    }
    public static void main(String[] args) {
        preprocess();
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int k = sc.nextInt();
            System.out.println(isEurekaNumber[k] ? "1":"0");
        }
    }
}
