package com.korit.String;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex1_4 {
    public static void main(String[] args) throws IOException {
       //String Tokenizer :  토큰을 분리해서 담는다.
        //단어의 개수
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       sc.close();
      StringTokenizer stringTokenizer =  new StringTokenizer(str, " ");
        System.out.println(stringTokenizer.countTokens());
//trim split를 이용해서 문제 풀이
        str = str.trim();
        String[] arr = str.split(" ");
        if(arr[0].equals(" ")) System.out.println(0);
        else System.out.println(arr.length);
//       //단어의 갯수
//       int count =0;
//       int pre =32; //공백을 의미한다
//       int str1 ;
//
//       while(true){
//           str1 = System.in.read();
//           if(str1 ==32){
//               if(pre != 32) count++;
//
//           } else if (str1 == 10) {
//               if(pre != 32) count++;
//               break;
//           }
//           pre = str1;
//       }
//        System.out.println(count);

    }
}
