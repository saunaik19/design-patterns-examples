package com.saurabh.example.designpatterns.venkatlecture.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TotalExampleUsingLambda<psvm> {

    public static Integer totalValues(List<Integer> numbers, Predicate<Integer> condition) {
        /*
        int result=0;
        for(Integer num:numbers){
            if(condition.test(num))
                result+=num;
        }
        */

      return numbers.stream().filter(condition).reduce(0, Integer::sum);
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("All : "+totalValues(numbers,e->true));

        System.out.println("Even :"+totalValues(numbers,e->(e%2)==0));
        System.out.println("Odd :"+totalValues(numbers,e->(e%2)!=0));

        System.out.println("Using lambda..............");

        
    }

}
