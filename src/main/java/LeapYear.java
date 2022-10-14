package main.java;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if ((year % 4 != 0 || year % 100 == 0) && (year % 100 != 0 || year % 400 == 0))
            return false;
        return true;
    }

    public static void main(String[] args) {
        int n = 0;
        for (int i = 1900; i <= 2016; i++) {
            if (isLeapYear(i))
                n++;
        }
        System.out.println(n);
    }
}
