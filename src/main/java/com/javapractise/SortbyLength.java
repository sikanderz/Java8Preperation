package com.javapractise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortbyLength
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
        names.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}
