package org.pcremades;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
        System.out.println("--------------------------------------");
        System.out.println("   ROCK-SCISSORS-PAPER, Let's play!   ");
        System.out.println("--------------------------------------");
        System.out.print("Welcome player, what is your name? ");
        String inputName = scanner.nextLine();

        Player playerOne = new Human(inputName);
        Player playerTwo = new Bot("Bot45122");

        RockScissorsPaperGame game = new RockScissorsPaperGame(playerOne, playerTwo, 3);
        GameResult gameResult = game.play();

        System.out.println(gameResult.result());
    }
}
