package com.javapractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Given a list of integers, find out all the numbers starting with 1 using Stream functions?*/
public class IntegerStrproblem {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,5,45,8,7,10);
        List<String> mylist = num.stream()
                               .map(String::valueOf)
                               .filter(n-> n.startsWith("1"))
                               .collect(Collectors.toList());
        System.out.println(mylist);

    }
}
/*[1, 10]*/
