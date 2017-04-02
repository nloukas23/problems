package com.nloukas.problems;

/**
 * Created by nloukas on 4/2/17.
 */
public class FizzBuzz {

    /*
    Write a program that outputs the string representation of numbers from 1 to n.
    But for multiples of three it should output “Fizz” instead of the number and
    for the multiples of five output “Buzz”. For numbers which are multiples of
    both three and five output “FizzBuzz”.
    Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
     */
    public static void main(String[] args) {
        fizzBuzz(15);
    }


    public static void fizzBuzz(final int n) {
        for (int index = 1; index <= n; index++) {

            boolean mod5 = index % 5 == 0;
            boolean mod3 = index % 3 == 0;

            if (mod5 && mod3) {
                System.out.println("FizzBuzz");
            } else if (mod3) {
                System.out.println("Fizz");
            } else if (mod5) {
                System.out.println("Buzz");
            } else {
                System.out.println(index);
            }
        }
    }
}
