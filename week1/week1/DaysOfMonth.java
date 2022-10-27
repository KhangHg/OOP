package week1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class DaysOfMonth {
    public static boolean checkLeapYear(int year) {

        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean leap;

        String[] days_31 = new String[] { "January", "Jan", "Jan.", "1",
                "March", "Mar", "Mar.", "3",
                "May", "5",
                "July", "Jul", "7",
                "August", "Aug", "Aug.", "8",
                "October", "Oct", "Oct.", "10",
                "December", "Dec.", "Dec", "12" };

        String[] days_30 = new String[] { "April", "Apr", "Apr.", "4",
                "June", "Jun", "6",
                "September", "Sept.", "Sep",
                "November", "Nov.", "Nov", "11" };

        String[] days_29 = new String[] { "February", "Feb.", "Feb", "2" };

        List<String> list31 = Arrays.asList(days_31);
        List<String> list30 = Arrays.asList(days_30);
        List<String> list29 = Arrays.asList(days_29);

        String month;
        int year;
        Scanner keyboard;

        do {
            keyboard = new Scanner(System.in);
            System.out.print("Input month : ");
            month = keyboard.nextLine();
            System.out.print("Input year: ");
            year = keyboard.nextInt();

        } while (!(list29.contains(month)) && !(list30.contains(month)) && !(list31.contains(month)));

        leap = checkLeapYear(year);

        if (list31.contains(month)) {
            System.out.println("Month has 31 days");
        } else if (list30.contains(month)) {
            System.out.println("Month has 30 days");
        } else if (list29.contains(month)) {
            if (leap) {
                System.out.println("Month has 29 days");
            } else {
                System.out.println("Month has 28 days");
            }
        }
        keyboard.close();
    }
}
