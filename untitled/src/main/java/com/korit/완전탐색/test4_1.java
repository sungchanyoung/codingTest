package com.korit.완전탐색;

import java.util.Scanner;

public class test4_1 {
    static boolean[] isEureKaNumber = new boolean[1001];
    public static  void preprocess(){
        //1.k 보다 작은 삼각수를 모두 구한다.
        int[] triangleNumbers = new int[50];
        int traiangleNumberCount = 0;
        for (int i = 1; ; i++) {
            int triangleNumber = i * (i+1)/2; //삼각수 구하는공식
            if(triangleNumber >= 1000) break;
            triangleNumbers[traiangleNumberCount++] = triangleNumber;
        }

        //2. 구해진 삼각 세개의 합으로 k를 나타낸 수 있는지 확인한다.
        boolean[] isSumOfTriangleNumber = new boolean[1001];
        for (int i = 0; i < traiangleNumberCount; i++) {
            for (int j = 0; j < traiangleNumberCount; j++) {
                int sum  =  triangleNumbers[i] + triangleNumbers[j];
                if(sum < 1000 )isSumOfTriangleNumber[sum] = true;
            }
        }
        for (int i = 0; i < 1000; i++) {
            if(!isSumOfTriangleNumber[i]) continue;
            for (int j = 0; j < traiangleNumberCount; j++) {
                int sum = i+ triangleNumbers[j];
                if(sum <= 1000) isSumOfTriangleNumber[sum] =true;
            }
        }
    }
    public static void main(String[] args) {
        preprocess();
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
           int k = sc.nextInt();
            System.out.println(isEureKaNumber[k]? "1" : "0");
        }
    }
}
