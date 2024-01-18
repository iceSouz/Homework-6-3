package algorithm;

import java.util.Random;

public class Algorithm {
    public static final int LOWER_NUMBER = 11;
    public static final int UPPER_NUMBER = 100_011;

    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(UPPER_NUMBER - LOWER_NUMBER) + LOWER_NUMBER;
        int resultSum = 0;

        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            temp /= 10;
            resultSum += digit;
        }

        System.out.println("A random number = " + number);
        System.out.println("Sum = " + resultSum);
    }
}
