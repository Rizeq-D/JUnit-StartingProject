package com.luv2code.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    @Test
    @DisplayName("Divisible by 3")
    @Order(1)
    void forDivisibleBy3(){
        String expected = "Fizz";
        assertEquals(expected, FizzBuzz.compute(3), "Should return Fizz");
    }

    @Test
    @DisplayName("Divisible by 5")
    @Order(2)
    void forDivisibleBy5(){
        String expected = "Buzz";
        assertEquals(expected, FizzBuzz.compute(5), "Should return Buzz");
    }

    @Test
    @DisplayName("Divisible by 3 and 5")
    @Order(3)
    void forDivisibleBy3and5(){
        String expected = "FizzBuzz";
        assertEquals(expected, FizzBuzz.compute(15), "Should return FizzBuzz");
    }

    @Test
    @DisplayName("Not Divisible by 3 and 5")
    @Order(4)
    void forNotDivisibleBy3and5(){
        String expected = "1";
        assertEquals(expected, FizzBuzz.compute(1), "Should return 1");
    }

}