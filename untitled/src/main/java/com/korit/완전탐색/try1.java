package com.korit.완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class try1 {
    public static void main(String[] args) throws IOException {
        // 2309  일곱 난쟁이
        //9 난쟁이 중에 7 난쟁의 키합이 100
        // 9중7을 찾는것은 9명 중에 2명을 뺸다
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        //길이가 9인 배열 생성 -> 난쟁이가 9명
        int[] arr = new int[9];
        //전체 난쟁이들의 키 총합을 위한 변수 선언
        int sum =0;
        for (int i = 0; i < 9; i++) {
            int n =Integer.parseInt(br.readLine());//값을 입력 받고
            arr[i] = n;
            sum += arr[i];
        }
        Arrays.sort(arr);
        int a = 0, b = 0;
        for (int i = 0; i < 9-1; i++) {
            for (int j = i+1; j < 9; j++) {
                if(sum - arr[i] -arr[j] == 100){
                    a = i;
                    b = j;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(i !=a && i!=b ){
                System.out.println(arr[i]);
            }
        }
    }
}
