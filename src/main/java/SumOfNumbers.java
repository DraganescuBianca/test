package main.java;

public class SumOfNumbers {

    public static int calculateSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        int sum = calculateSum();
        System.out.println(sum);
    }
}
