package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        boolean leap;
        if(year % 100 == 0) {
            if(year % 400 == 0) {
                leap = true;
            } else {
                leap = false;
            }
        } else {
            if (year % 4 == 0) {
                leap = true;
            } else {
                leap = false;
            }
        }
        switch (month) {
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                System.out.println(31);
                break;
            case (4):
            case (6):
            case (9):
            case (11):
                System.out.println(30);
                break;
            case (2):
                if(leap) {System.out.println(29);}
                else {System.out.println(28);}
                break;
            default:
                System.out.println("invalid date");
                break;
        }
    }

}
