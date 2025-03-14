package com.korit.String;

import java.util.Scanner;

public class test2 {
    public static int[] get(String s){
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) -'a']++;
        }
        return count;
    }

    public static void main(String[] args) {
        //애너 그램- 일종의 말장난으로 어떠한 단어의 문자를 재배열하여 다른 뜻을 가지는 다른 단어로 바꾸는 것
        Scanner sc= new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        // 알파벳 갯수 만큼 배열 설정 빈도수 를 체크 하기 위한 배열
        int[] countA = new int[26];
        int[] countB = new int[26];
        int ans =0;

        for (int i = 0; i < a.length(); i++) {
            countA[a.charAt(i) -'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            countB[b.charAt(i) -'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if(countA[i] > countB[i] ){
                ans +=  countA[i] - countB[i];
            } else if (countB[i] > countA[i]) {
                ans += countB[i] - countA[i];
            }
        }
        System.out.println(ans);

    }
}
