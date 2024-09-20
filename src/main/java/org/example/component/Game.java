package org.example.component;

import java.util.Random;
import java.util.Scanner;

public class Game {


    public void start() {
        System.out.println("Hi");
        System.out.println("write the number of attempts: ");
        Scanner scanner = new Scanner(System.in);

        int userAttempts = scanner.nextInt();
        System.out.println("How many numbers you will guess from");
        int userRange = scanner.nextInt();

        GameLogic gameLogic = new GameLogic();
        gameLogic.logicGame(userRange, userAttempts);

    }


}
