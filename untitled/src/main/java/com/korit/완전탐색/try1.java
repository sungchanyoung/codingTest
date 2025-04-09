package com.korit.완전탐색;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class try1 {
    HashSet<Integer> set = new HashSet<>();
    public boolean isPrime(int number){
        if(number ==0 || number == 1)
            return  false;
        int lim  = (int) Math.sqrt(number);
        for (int i = 2; i <= lim; i++) {
            if(lim % 2 ==0)
                return false;
        }
        return true;
    }

    public void recurive(String comb, String others){
        if(!comb.equals(""))
            set.add(Integer.valueOf(comb));

        for (int i = 0; i < others.length(); i++) {
            recurive(comb+others.charAt(i), others.substring(0,i)+ others.substring(i+1));
        }
    }

    public int solution(String num){
        int answer =0;
        recurive("",num);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            int number = it.next();
            if(isPrime(number)){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
       try1 try1= new try1();
       System.out.println(try1.solution("17"));

    }
}
