package com.Bridgelabz.Day13Assignment;

public class PrintMaxGenericMethod<T extends Comparable<T>>
{
    T a,b,c;

        //Generic Constructor for Handling Different Type Object

        PrintMaxGenericMethod(T a, T b, T c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        //compareTo method for Checking Maximum from 3 Integer Object

        public T compareTo() {
            if(a.compareTo(b) > 0){
                if(a.compareTo(c) > 0) {
                    return a;
                } else {
                    return c;
                }
            } else {
                if(b.compareTo(c) > 0) {
                    return b;
                } else {
                    return c;
                }
            }
        }

        public static void main(String[] args) {
            //Welcome message for User
            System.out.println("Welcome to Java Core - Generics Test Maximum using Genric Class.");

            //Creating Generic Integer Object for Integer Comparison
            PrintMaxGenericMethod<Integer> integerComparison = new PrintMaxGenericMethod(45,67,38);
            System.out.println("Maximum from 3 Integer Object : "+integerComparison.compareTo());

            //Creating Generic Float Object for Float Comparison
            PrintMaxGenericMethod<Float> floatComparison = new PrintMaxGenericMethod(7.4F,2.6F,4.9F);
            System.out.println("Maximum from 3 Float Object : "+floatComparison.compareTo());

            //Creating Generic String Object for String Comparison
            PrintMaxGenericMethod<String> stringComparison = new PrintMaxGenericMethod("Smita","Ramteke","Chokhandre");
            System.out.println("Maximum from 3 String Object : "+stringComparison.compareTo());

        }
    }

