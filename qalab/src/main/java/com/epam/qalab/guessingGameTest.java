package com.epam.qalab;

public class guessingGameTest {
    public static void main(String[] args) {

        int randomNumber = GuessingGame.generatenumber();
        assert (randomNumber <= 100 && randomNumber >= 0);
        System.out.println("Generated number is less or equal to 100");
        int inputNumber = GuessingGame.userNumber();
        if (inputNumber <= 100 && randomNumber >= 0) {
            if (inputNumber == randomNumber) {
                System.out.println("Success");
            } else {
                System.out.println("Maybe next time:)");
            }
        } else {
            System.out.println("You entered wrong number, try again");
        }
    }
}

