package com.korit.String;


import java.util.Scanner;

public class test1_3 {
    public static int[] getApalbet(String s){
        int[] count  = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if('A' <= ch && ch <= 'Z') count[ch - 'A']++;
            else count[ch -'a']++;
        }
        return count;
    }


    public static void main(String[] args) {
        // 단어 공부- 대소문자 굿분 하지 않음
        // 각 알파벳의 개수를 구한다 2.그중에 최댓값을 구한다.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] count = getApalbet(s);
        int  maxCount = -1;
        int maxAlpabet = '?';

        for (int i = 0; i < 26; i++) {
            if(count[i] > maxCount){
                maxCount = count[i];
                maxAlpabet = (char)('A' + maxCount);
            } else if (count[i] == maxCount) {
                maxAlpabet= '?';
            }
        }
        System.out.println(maxAlpabet);
    }

}
