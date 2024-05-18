package com.javapractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Q1 Given a list of integers, find out all the even numbers exist in the list using Stream functions?
 */
public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(1,2,5,10,17);
       List<Integer>myList = lists.stream().filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(myList);


    }
}
/*[2, 10]*/