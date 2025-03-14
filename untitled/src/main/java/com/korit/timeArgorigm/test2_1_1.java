package com.korit.timeArgorigm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2_1_1 {
    public static void main(String[] args) throws IOException {//String으로 리턴 값이 고정되어 있기 떄문에 다른 타입으로
        // 형변환 반드시 필요 + 예외 처리 반드시 해야됨
        //Scanner 보다 빠른 buffer
//        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));//입력 선언
//        StringTokenizer st =  new StringTokenizer(br.readLine());//readLine 한줄 읽음
//        int w = Integer.parseInt(st.nextToken());
//        int h = Integer.parseInt(st.nextToken());
//        st =  new StringTokenizer(br.readLine());
//        int p = Integer.parseInt(st.nextToken());
//        int q = Integer.parseInt(st.nextToken());
//        int t =  Integer.parseInt(br.readLine());
//
//        p = (p + t ) % (2* w);
//        q = (q +t) %(2*h);
//        if(p > w) p = w -(p-w);
//        if(q > h) q = h - (q -h);
//        System.out.println(p+" " + q);
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w =  Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        p =  (p+t) %(2*w);
        q = (q+t) % (2*h);
        if(p > w) p = w -(p-w);
        if(q > h) q = h -(q-h);
        System.out.println(p+" "+q);


    }
}
