package org.example;

public class FizzBuzz {
    public String generateFizzBuzz(int number){
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }

}

