package com.javapractise;

import java.util.Arrays;
import java.util.List;

/*Given a list of integers, find the total number of elements present in the list using Stream functions?*/
public class Count {
    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long count = lists.stream().count();
        System.out.println(count);

    }
}
