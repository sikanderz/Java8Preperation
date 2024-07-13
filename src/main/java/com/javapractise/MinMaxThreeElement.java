package com.javapractise;

import java.util.List;
import java.util.stream.Collectors;

public class MinMaxThreeElement {
    public static void main(String[] args) {
        List<Integer> randomNumber = List.of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        List<Integer> min3 = randomNumber.stream()
                .sorted(Integer::compareTo)
                .limit(3)
                .collect(Collectors.toList());
        List<Integer> max3 = randomNumber.stream()
                .sorted((x,y)->Integer.compare(y,x))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(min3);
        System.out.println(max3);
    }
}
