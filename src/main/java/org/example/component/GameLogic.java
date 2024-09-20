package org.example.component;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {

    private final Random random = new Random();
    private int userNumber;
    private final Scanner scanner = new Scanner(System.in);
    private int[] arrayCountUser = new int[6];
    private int[] arrayRangeUser = new int[6];


    public void logicGame(int range, int countUser) {

        final int secretNumber = random.nextInt(range);

        int toCalculateRange = range;
        int toCalculateCountUser = countUser;
        subtractPercentageAndRoundDown(toCalculateCountUser);
        subtractArrayToNumberPercentageAndRoundDown(toCalculateRange);


        System.out.println("so the range of numbers up to " + range);
        System.out.println("Number of attempts: " + countUser);

        System.out.println("Enter number");
        while (true) {
            countUser--;
            userNumber = scanner.nextInt();
            if (secretNumber == userNumber) {
                System.out.println("YOU WIN!!!");
                break;
            }


            /*
            the idea of implementation is not bad, but it needs to be finalized and put in a separate class as a USER'S HELP
             */


            if (countUser == arrayCountUser[0]) {
                if (secretNumber <= arrayRangeUser[5]) {
                    System.out.println("Загадане число менше або дірівнює " + arrayRangeUser[5]);
                }
            } else if (countUser == arrayCountUser[1]) {
                if (secretNumber <= arrayRangeUser[4]) {
                    System.out.println("Загадане число менше або дірівнює " + arrayRangeUser[4]);
                }
            } else if (countUser == arrayCountUser[2]) {
                if (secretNumber <= arrayRangeUser[3]) {
                    System.out.println("Загадане число менше або дірівнює " + arrayRangeUser[3]);
                }
            } else if (countUser == arrayCountUser[3]) {
                if (secretNumber <= arrayRangeUser[2]) {
                    System.out.println("Загадане число менше або дірівнює " + arrayRangeUser[2]);
                }
            } else if (countUser == arrayCountUser[4]) {
                if (secretNumber <= arrayRangeUser[1]) {
                    System.out.println("Загадане число менше або дірівнює " + arrayRangeUser[1]);
                }
            } else if (countUser == arrayCountUser[5]) {
                if (secretNumber <= arrayRangeUser[0]) {
                    System.out.println("Загадане число менше або дірівнює " + arrayRangeUser[0]);
                }
            }

            if (countUser == 0) {
                System.out.println("I'm sorry, you don't have any more attempts left");
                System.out.println("Secret number is: " + secretNumber);
                break;
            } else {
                System.out.println("Your attempts = " + countUser);
            }
        }
    }

    public void subtractPercentageAndRoundDown(int number) {
        double percentage = 15.0;
        for (int i = 0; i < arrayCountUser.length; i++) {
            double percentageValue = (number * percentage) / 100.0;
            int roundedPercentageValue = (int) Math.floor(percentageValue);
            arrayCountUser[i] = number - roundedPercentageValue;
            percentage += 13;
        }
    }

    public void subtractArrayToNumberPercentageAndRoundDown(int number) {
        double percentage = 15.0;
        for (int i = 0; i < arrayRangeUser.length; i++) {
            double percentageValue = (number * percentage) / 100.0;
            int roundedPercentageValue = (int) Math.floor(percentageValue);
            arrayRangeUser[i] = number - roundedPercentageValue;
            percentage += 13;
        }
    }


}
