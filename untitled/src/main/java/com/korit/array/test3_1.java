package com.korit.array;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Map;
import java.util.Scanner;

public class test3_1 {
    // 성 지키기 1236
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] ch = new char[n][m];
        for (int i = 0; i < n; i++) {
            ch[i] = sc.next().toCharArray();
        }
        boolean[] existRow = new boolean[n];
        boolean[] existCol = new boolean[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(ch[i][j] =='X'){
                    existRow[i] =true;
                    existCol[j] = true;
                }
            }
        }
        int needRow = n;
        int needCol = m;
        for (int i = 0; i < n; i++) {
            if(existRow[i]) needRow --;
        }
        for (int i = 0; i < m; i++) {
            if (existCol[i]) needCol--;
        }
        System.out.println(Math.max(needRow,needCol));
    }
}