package com.luv2code.tdd;

public class FizzBuzz {

    // if a number is divisible by 3, print Fizz.
    // if a number is divisible by 5, print Buzz.
    //if a number is divisible by 3 and 5, print FizzBuzz.
    //if a number is not divisible by 3 and 5, print the number.
    public static String compute(int i) {

        //first way of doing it:

        StringBuilder result = new StringBuilder();

        if (i % 3 == 0) {
            result.append("Fizz");
        }

        if (i % 5 == 0) {
            result.append("Buzz");
        }

        if (result.isEmpty()) {
            result.append(i);
        }

        return result.toString();
    }

}
 /*
    second way of doing it:

    if ((i % 3 == 0) && (i % 5 == 0)) {
            return "FizzBuzz";
        }

        else if (i % 3 == 0) {
            return "Fizz";
        }

        else if (i % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(i);

     */
