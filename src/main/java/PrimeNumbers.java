package main.java;

public class PrimeNumbers {

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        final int MAX_NUMBER = 1000000;
        for (int i = 2; i <= MAX_NUMBER; i++) {
            if (isPrime(i))
                System.out.println("Number " + i + " is prime!");
        }
    }
}
