package com.javapractise;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String string1= "listen";
        String string2="silent";
        String join1 = Arrays.stream(string1.split(""))
                .sorted()
                .collect(Collectors.joining(""));
        String join = Arrays.stream(string2.split(""))
                .sorted()
                .collect(Collectors.joining(""));
        if(join.equals(join1))
        {
            System.out.println("is Anagram number");
        }
        else {
            System.out.println("is not  Anagram number");
        }
    }
}
