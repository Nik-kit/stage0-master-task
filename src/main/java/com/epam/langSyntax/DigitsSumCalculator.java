package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int x = number % 10;
        int y = ((number - x) % 100) / 10;
        int z = ((number - ((number - x) % 100) - x) % 1000) / 100;
        int d = (number - ((number - ((number - x) % 100) - x) % 1000) - ((number - x) % 100) - x) / 1000;
        System.out.println(x + y + z + d);
    }

}
