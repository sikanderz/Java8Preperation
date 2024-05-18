package com.javapractise;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*Remove duplicate elements from a list using Java 8 streams

Write a Java 8 program to remove duplicate elements from a list using the stream API and lambda expressions.*/
public class DistinctElement {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 5, 1, 2, 3, 4, 5, 7, 4);
        List<Integer> distinct = nums.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinct);
        /*Second Approach*/
        Set<Integer> set = nums.stream()
                .collect(Collectors.toSet());
        System.out.println(set);
    }
}
