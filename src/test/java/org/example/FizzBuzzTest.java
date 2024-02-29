package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testGenerateFizzBuzzForNumberNotDivisibleByThreeOrFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.generateFizzBuzz(1));
    }

    @Test
    public void testGenerateFizzBuzzForNumberDivisibleByThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.generateFizzBuzz(3));
    }

    @Test
    public void testGenerateFizzBuzzForNumberDivisibleByFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.generateFizzBuzz(5));
    }

    @Test
    public void testGenerateFizzBuzzForNumberDivisibleByBothThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.generateFizzBuzz(15));
    }
}