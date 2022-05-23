package com.Bridgelabz.Day13Assignment;

public class MaxIntFloatString
{

        // determines the largest of three Comparable objects
        public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
            T max = x; // assume x is initially the largest

            if (y.compareTo(max) > 0)
                max = y; // y is the largest so far

            if (z.compareTo(max) > 0)
                max = z; // z is the largest

            return max; // returns the largest object
        } // end method maximum

        public static void main(String args[]) {
            System.out.printf("Maximum of %d, %d and %d is %d\n\n", 12, 34, 56,
                    maximum(12, 34, 56));
            System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 5.7, 2.0, 4.7,
                    maximum(5.7, 2.0, 4.7));
            System.out.printf("Maximum of %s, %s and %s is %s\n\n", "Smita", "Ramteke", "Chokhandre",
                    maximum("Smita", "Ramteke", "Chokhandre"));

        }

}

