package org.example.component;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private final Random random = new Random();
    private final int secretNumber = random.nextInt(101);
    private int userNumber;
    private final Scanner scanner = new Scanner(System.in);
    private int count = 10;

    public void start() {
        System.out.println("Hello game starts\n" +
                "guess a number from 1 to 100");
        System.out.println("You have 10 tries for everything");

        while (count > 0) {
            count--;
            userNumber = scanner.nextInt();
            if (secretNumber == userNumber) {
                System.out.println("YOU WIN!!!");
                break;
            }

            if (count == 8) {
                if (secretNumber >= 60) {
                    System.out.println("The secret number more about is equal to 60");
                } else {
                    System.out.println("The secret number less about is equal to 60");
                }
            } else if (count == 5) {
                if(secretNumber > userNumber) {
                    System.out.println("the secret number is greater than the one you entered");
                } else {
                    System.out.println("the secret number is less than the one you entered");
                }
            }

            if (count == 0) {
                System.out.println("I'm sorry, you don't have any more attempts left");
                System.out.println("Secret number is: " + secretNumber);
            } else {
                System.out.println("Your attempts = " + count);
            }
        }


    }


}
