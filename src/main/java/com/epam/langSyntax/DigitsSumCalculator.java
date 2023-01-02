package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int a = number % 10;
        int b = number / 10 % 10;
        int c = number / 100 % 10;
        int d = number / 1000;
        int sum = a + b + c + d;

        System.out.println(sum);

    }

}
