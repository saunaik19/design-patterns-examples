package com.saurabh.example.designpatterns.venkatlecture.strategy;

import java.util.Arrays;
import java.util.List;

public class TotalExample<psvm> {

    public static Integer totalValues(List<Integer> numbers) {
        int result = 0;
        for (Integer num : numbers)
            result += num;
        return result;
    }

    public static Integer totalEvenValues(List<Integer> numbers) {
        int result = 0;
        for (Integer num : numbers) {
            if (num % 2 == 0)
                result += num;
        }
        return result;
    }
    public static Integer totalOddValues(List<Integer> numbers) {
        int result = 0;
        for (Integer num : numbers) {
            if (num % 2 != 0)
                result += num;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("All : "+totalValues(numbers));

        System.out.println("Even :"+totalEvenValues(numbers));
        System.out.println("Odd :"+totalOddValues(numbers));

        System.out.println("Using lambda..............");


    }

}
