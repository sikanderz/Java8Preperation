package com.javapractise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*Given the list of integers, find the first element of the list using Stream functions?*/
public class FirstElement {
    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(10,15,8,49,25,98,98,32,15);
         Optional<Integer> firstelement=lists.stream()
                .findFirst();
         if (firstelement.isPresent())
         {
             System.out.println(firstelement.get());
         }
         else {
             System.out.println("element not found");
         }
    }
}
