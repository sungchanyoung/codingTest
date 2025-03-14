package com.korit.String;

import javax.print.DocFlavor;
import java.util.Scanner;

public class test1_4 {
    public static void main(String[] args) {
        //문서 검색
        Scanner sc = new Scanner(System.in);
        String doc =  sc.nextLine();
        String word = sc.nextLine();

       int count=0;
       int startIndex =0;
//replace
        while (true){
            int findIndex = doc.indexOf(word, startIndex);
            if (findIndex < 0) break;
        }

        for (int i = 0; i < doc.length(); i++) {
            boolean isMatch = true;
            for (int j = 0; j < word.length(); j++) {
                if(i+j >= doc.length() && doc.charAt(i+j) != word.charAt(j)){
                    isMatch = false;
                    break;
                }
                if (isMatch){
                    count++;
                    i+= word.length()+i;
                }
            }
        }



    }
}
