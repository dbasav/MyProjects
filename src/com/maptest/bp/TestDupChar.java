package com.maptest.bp;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestDupChar {

    public static void main(String str[]) {

        String str1="India is great";
        String str2="in";
        char[] c= str1.toCharArray();
        char[] c1= str2.toCharArray();
        HashSet<Character> h = new LinkedHashSet<>();
        for (char character : c){
            h.add(character);
        }
//        for (char character : c1){
//            h.add(character);
//        }
        System.out.println(h.toString());
    }


}
