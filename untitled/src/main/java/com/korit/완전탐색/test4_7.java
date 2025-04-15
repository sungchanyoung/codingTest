package com.korit.완전탐색;

import java.util.Scanner;

public class test4_7 {
    public  static boolean[][] arr;
    public  static int min = 64;

    public static void find(int x, int y){
        int end_x = x+8;
        int end_y= y+8;
        int count =0;
        boolean tf = arr[x][y];
        for (int i = x; i <end_x ; i++) {
            for (int j = y; j <end_y ; j++) {
                if(arr[i][j] != tf){
                    count++;
                }
                tf  =(!tf);
            }
            tf= !tf;
        }
        count= Math.min(count, 64-count);
        min = Math.min(min,count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        arr = new boolean[n][m];
        //배열 입력
        for (int i = 0; i < n; i++) {
            String str = sc.next();

            for (int j = 0; j < m; j++) {
                if(str.charAt(j) == 'W'){
                    arr[i][j] = true;
                }else{
                    arr[i][j] =false;
                }
            }
        }
        int n_row = n-7;
        int m_col = m-7;
        for (int i = 0; i < n_row; i++) {
            for (int j = 0; j < m_col; j++) {
                find(i,j);
            }
        }
        System.out.println(min);
    }

}
