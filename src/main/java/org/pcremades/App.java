package org.pcremades;

import java.util.Scanner;

/**
 * Rock-Scissors-Paper Game main class.
 */
public class App 
{
    private static final String BOT_NAME = "Bot_999999";

    private static final int NUMBER_OF_ROUNDS = 3;

    public static void main( String[] args ) {

        System.out.println(Message.LINE);
        System.out.println(Message.TITTLE);
        System.out.println(Message.LINE);
        System.out.print(Message.GREETINGS);

        final Scanner scanner = new Scanner(System.in);
        final String inputName = scanner.nextLine();

        final Player playerOne = new Human(inputName, scanner);
        final Player playerTwo = new Bot(BOT_NAME);

        final RockScissorsPaperGame game = new RockScissorsPaperGame(playerOne, playerTwo, NUMBER_OF_ROUNDS);
        final GameResult gameResult = game.play();

        System.out.println("***" + gameResult.result() + "***");
    }
}
