package com.epam.qalab;

import java.util.*;

public class GuessingGame {

    public static void main(String... args) {
    }

    static int userNumber() {
        System.out.println("Please enter a number from 0 to 100 inclusively");
        Scanner scanner = new Scanner(System.in);
        int guessnumber = Integer.parseInt(scanner.nextLine());
        return guessnumber;
    }
    static int generatenumber() {
        Random random = new Random();
        int generateNumber = random.nextInt(101);
        return generateNumber;
    }
}






