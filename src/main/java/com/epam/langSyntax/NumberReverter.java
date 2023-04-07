package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int x = number % 10;
        int y = ((number - x) % 100) / 10;
        int z = (number - ((number - x) % 100) - x) / 100;
        System.out.println(x + "" + y + "" + z);
    }

}
