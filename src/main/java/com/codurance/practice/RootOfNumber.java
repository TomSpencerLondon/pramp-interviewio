package com.codurance.practice;

public class RootOfNumber {
    public double root(double input, int n) {
        return rootHelper(input, n, 0, input);
    }


    private double rootHelper(double input, int n, double lowerBound, double upperBound){
        double guess;
        double approxRoot = (lowerBound + upperBound) / 2;
        guess = approxRoot;


        if (guess - lowerBound <= 0.001){
            return (double)Math.round(guess * 1000d) / 1000d;
        }
        if (Math.pow(guess, n) > input){
            return rootHelper(input, n, lowerBound, (upperBound + lowerBound) / 2);
        }else if (Math.pow(guess, n) < input){
            return rootHelper(input, n, (lowerBound + upperBound) / 2, upperBound);
        }else{
            return rootHelper(input, n, lowerBound, upperBound);
        }
    }
}
