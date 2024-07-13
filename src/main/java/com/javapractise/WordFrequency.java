package com.javapractise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class WordFrequency {
 /* Find the frequency of each element in an array or a list*/
    public static void main(String[] args) {
        List<String> names =  Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
        Map<String,Long> frequencyWords = names.stream()
                .collect(groupingBy(Function.identity(),counting()));
        System.out.println(frequencyWords);
    }
}
