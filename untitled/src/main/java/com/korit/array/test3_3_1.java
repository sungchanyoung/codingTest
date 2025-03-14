package com.korit.array;

import java.io.*;
import java.util.Scanner;

public class test3_3_1 {
    public static void main(String[] args) throws IOException {
        // Scanner을 사용한 코드
//        Scanner sc= new Scanner(System.in);
//        int t =sc.nextInt();
//        while(t-- >0){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println(a+b);
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            String[] nums = br.readLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
           bw.write(a + b + "\n");
        }
        bw.flush();
    }
}
