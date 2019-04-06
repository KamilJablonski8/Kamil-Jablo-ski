package com.Task1;

public class Zadanie2 {
    public static void main(String[] args) {


        int grade = 4;
        switch (grade) {
            case 1:
                System.out.println("niedostateczny");
                break;
            case 2:
                System.out.println("mierny");
                break;
            case 3:
                System.out.println("dostateczny");
                break;
            case 4:
                System.out.println("dobry");
                break;
            case 5:
                System.out.println("bardzo dobry");
                break;
            case 6:
                System.out.println("celujący");
                break;
            default:
                System.out.println("liczba poza skalą ocen");
        }
///////////////////////////////////////////
        String roman = "IV";
        switch (roman) {
            case "I":
                System.out.println("1");
                break;
            case "II":
                System.out.println("2");
                break;
            case "III":
                System.out.println("3");
                break;
            case "IV":
                System.out.println("4");
                break;
            case "V":
                System.out.println("5");
                break;
            case "VI":
                System.out.println("6");
                break;
            case "VII":
                System.out.println("7");
                break;
            case "VIII":
                System.out.println("8");
                break;
            case "IX":
                System.out.println("9");
                break;
            default:
                System.out.println("unknown number");
        }
        ////////////////////////////////////////////////////
        int code = 1;
        if (code >= 0 && code <= 9) {
            System.out.println("It's the digit!");
        } else if (code >= 'a' && code <= 'z') {
            System.out.println("It's the small letter!");
        } else if (code >= 'A' && code <= 'Z') {
            System.out.println("It's the large letter!");
        } else {
            System.out.println("Unknonw code!");
        }
/////////////////////////////////////////////////////////////////////////////
        int a = 101;

        if (a <= '0') {
            System.out.println("mniejsze lub równe 0");
        } else if (a <= 10) {
            System.out.println("przedzial 1-10");
        } else if (a <= 100) {
            System.out.println("przedzial 11-100");
        } else if (a < 1000) {
            System.out.println("przedzial 101-1000");
        } else {
            System.out.println("ponad 10000");
        }
/////////////////////////////////////////////////////////////////

        int dayNumber = 7;
        String dayName = "unknown";
        switch (dayNumber) {
            case 1:
                dayName = "poniedziałek";
                break;
            case 2:
                dayName = "wtorek";
                break;
            case 3:
                dayName = "środa";
                break;
            case 4:
                dayName = "czwartek";
                break;
            case 5:
                dayName = "piątek";
                break;
            case 6:
                dayName = "sobota";
                break;
            case 7:
                dayName = "niedziela";
                break;
        }
        int numberOfDaysToWeekend = 6 - dayNumber;
        String message = "";
        if (numberOfDaysToWeekend > 0 && numberOfDaysToWeekend <= 5) {
            message = "Number of days to weekend: " + numberOfDaysToWeekend;
        } else if (numberOfDaysToWeekend == 0 || numberOfDaysToWeekend == -1) {
            message = "It's the weekend :) !";
        }

        System.out.println("Your day is " + dayName + " " + message);
    }

}


//public static void checkNumber(int a) { }



