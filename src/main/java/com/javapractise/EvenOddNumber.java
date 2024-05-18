package com.javapractise;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Separate odd and even numbers in a list of integers
Given a list of integers, write a Java 8 program to separate the odd and even numbers into two separate lists.*/
public class EvenOddNumber {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 9);
        Map<Boolean, List<Integer>> partitonOfNumber = nums.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        List<Integer> evenNumbers = partitonOfNumber.get(true);
        List<Integer> oddNumbers = partitonOfNumber.get(false);
        System.out.println(evenNumbers + " \n" + oddNumbers);

        /*Second Approach*/
        List<Integer> evenList = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        List<Integer> oddList = nums.stream()
                .filter(o -> o % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(evenList + "\n" + oddList);
    }


}
