package com.javapractise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*How to find duplicate elements in a given integers list in java using Stream functions?*/
public class DuplicateNum {
    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(1,2,3,4,2,5,7,5);
        Set<Integer> set = new HashSet<>();
        List<Integer> myList = lists.stream()
                .filter(n->!set.add(n))
                .collect(Collectors.toList());
        System.out.println(myList);

    }
}
/*[2, 5]*/