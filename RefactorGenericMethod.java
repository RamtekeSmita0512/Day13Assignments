package com.Bridgelabz.Day13Assignment;

public class RefactorGenericMethod {
    public static <T extends Comparable> T getMax(T first, T second, T third) {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0) {
            return first;
        } else if (second.compareTo(first) > 0 && second.compareTo(third) > 0) {
            return second;
        } else {
            return third;
        }
    }

    public static void main(String[] args) {
        Integer firstInt = 45, secondInt =67 , thirdInt =38 ;
        Float firstFloat = 7.4f, secondFloat = 2.6f, thirdFloat = 4.9f;
        String firstString = "Smita", secondString = "Ramteke", thirdString = "Chokhandre";
        System.out.println(getMax(firstInt, secondInt, thirdInt));
        System.out.println(getMax(firstFloat, secondFloat, thirdFloat));
        System.out.println(getMax(firstString, secondString, thirdString));
    }
}
