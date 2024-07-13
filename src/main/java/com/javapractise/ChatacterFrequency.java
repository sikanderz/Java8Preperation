package com.javapractise;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class ChatacterFrequency {
   /*Find the frequency of each character in a string using Java 8 streams*/
    public static void main(String[] args) {
        String name ="rohitroh";
        Map<String,Long> characterfrequency = Arrays.stream(name.split(""))
                .collect(groupingBy(Function.identity(),counting()));
        System.out.println(characterfrequency);

        Map<String,Integer> characterfrequency1 = Arrays.stream(name.split(""))
                .collect(groupingBy(Function.identity(),collectingAndThen(counting(),Long::intValue)));
        System.out.println(characterfrequency1);
    }
}
