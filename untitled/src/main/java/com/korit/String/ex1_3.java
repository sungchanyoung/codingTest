package com.korit.String;

import java.util.Scanner;

public class ex1_3 {//알파벳 찾기
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] alpa = new int[26];
        String s = sc.nextLine();

        for (int i = 0; i < alpa.length; i++) {
            alpa[i] =-1;
        }

        for (int i = 0; i < alpa.length; i++) {
            char ch = s.charAt(i);
            if(alpa[ch - 'a'] == -1)
                alpa[ch - 'a'] = i;
        }
        for(int val : alpa){
            System.out.println(val + " ");
        }
    }
}
