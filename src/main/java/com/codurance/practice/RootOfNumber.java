package com.codurance.practice;

public class RootOfNumber {
    public double root(double input, int n) {
        double guess;
        double lowerBound = 0;
        double upperBound = input;
        double approxRoot = (upperBound + lowerBound) / 2;

        guess = approxRoot;

        while(guess - lowerBound >= 0.001){
            if (Math.pow(guess, n) > input){
                upperBound = guess;
            }else if(Math.pow(guess, n) < input){
                lowerBound = guess;
            }else{
                break;
            }
            guess = (upperBound + lowerBound) / 2;
        }

        return (double)Math.round(guess * 1000d) / 1000d;
    }
}
