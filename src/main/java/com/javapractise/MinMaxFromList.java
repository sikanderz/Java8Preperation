package com.javapractise;

import java.util.List;

public class MinMaxFromList {
    public static void main(String[] args) {
        List<Integer> random = List.of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        Integer max1= random.stream()
                .max(Integer::compareTo)
                .orElse(Integer.MAX_VALUE);
        Integer min1=random.stream()
                .min(Integer::compareTo)
                .orElse(Integer.MIN_VALUE);
   }
}
