package com.javapractise;

import java.util.List;
import java.util.stream.Collectors;

public class ReverseSortList {
    public static void main(String[] args) {
        List<Integer> random = List.of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        System.out.println(random);
        List<Integer> sorInReverse = random
                .stream()
                .sorted((x,y)->Integer.compare(y,x))
                .collect(Collectors.toList());
        System.out.println(sorInReverse);

    }
}
