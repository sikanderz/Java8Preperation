package com.javapractise;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.partitioningBy;

/*Q1 Given a list of integers, find out all the even numbers exist in the list using Stream functions?
 */
public class EvenNumber {
    public static void main(String[] args) {
     /*   List<Integer> lists = Arrays.asList(1,2,5,10,17);
       List<Integer>myList = lists.stream().filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(myList);*/

       /* List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> evenAddOddSeparation = oneToTen.stream()
                .collect(partitioningBy(i -> i % 2 == 0));

        System.out.println(evenAddOddSeparation);*/
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Collection<List<Integer>> evenOddList = oneToTen.stream()
                .collect(collectingAndThen(partitioningBy(i -> i % 2 == 0), Map::values));

        System.out.println(evenOddList);


    }
}
/*[2, 10]*/