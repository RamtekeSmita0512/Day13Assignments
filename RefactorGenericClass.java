package com.Bridgelabz.Day13Assignment;

    public class RefactorGenericClass<T extends Comparable<T>> {

        public T getMax(T first , T second , T three ) {
            T max = first;
            if (second.compareTo(max) > 0 ) {
                max = second;
            }
            if (three.compareTo(max) > 0){
                max = three;
            }
            printMax(first , second , three , max);
            return max;
        }
        public static String getMaxStr(String a , String b , String c ) {
            String max = a ;
            if (b.compareTo(max) > 0 ) {
                max = b;
            }
            if (c.compareTo(max) > 0) {
                max = c;
            }
            printMax(a , b , c , max);
            return max;
        }
        public static <T> void printMax(T a, T b, T c, T max) {
            System.out.printf("Max of %s, %s and %s is %s\n",a,b,c,max);
        }
        public static void main(String[] args) {
            Integer firstInt = 45, secondInt = 67, thirdInt = 38;
            Float firstFloat = 7.4f, secondFloat = 2.6f, thirdFloat =  4.9f;
            String firstString = "Smita", secondString = "Ramteke", thirdString = "Chokhandre";

            RefactorGenericClass<String> refactorGenericClass = new RefactorGenericClass();
            RefactorGenericClass<Integer> refactorGenericClass1 = new RefactorGenericClass();
            RefactorGenericClass<Float> refactorGenericClass11 = new RefactorGenericClass();

            System.out.println(refactorGenericClass.getMax(firstString, secondString, thirdString));

        }
    }
