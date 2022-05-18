package com.Bridgelabz.Day13Assignment;


public class MaximumInteger<T extends Comparable<T>> {
    T x, y, z;
    public MaximumInteger(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T maximum() {
        return maximum(x, y, z);
    }

    // determines the largest of three comparable objects

    public static <T extends Comparable<T>> T maximum (T x, T y, T z) {
        T max = x;                 // assume x is initially the largest
        if(y.compareTo(max) > 0) {
            max = y;              // y is the largest so far
        }
        if(z.compareTo(max) > 0) {
            max = z;             // z is the largest now
        }
        printMax(x, y, z, max);
        return max;             // returns the largest object
    }
    public static String testMaximum(String x, String y, String z) {
        String max = x;
        if(y.compareTo(max) > 0) {
            max = y;           // y is the largest so far
        }
        if(z.compareTo(max) > 0) {
            max = z;          // z is the largest now
        }
        printMax(x, y, z, max);
        return max;          // returns the largest object
    }
    public static <T> void printMax (T x, T y, T z, T max) {
        System.out.printf("Max of %s, %s and %s is %s\n",x, y, z, max);
    }
    public static void main(String args[]) {
        Integer xInt = 45, yInt = 67, zInt = 38;

        new MaximumInteger(xInt, yInt, zInt).maximum();

    }
}

