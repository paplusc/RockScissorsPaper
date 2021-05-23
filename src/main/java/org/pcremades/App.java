package org.pcremades;

import java.util.Scanner;

/**
 * Rock-Scissors-Paper Game to play in the console.
 *
 */
public class App 
{
    private static final String BOT_NAME = "Bot_999999";

    public static void main( String[] args ) {

        System.out.println(Message.LINE);
        System.out.println(Message.TITTLE);
        System.out.println(Message.LINE);
        System.out.print(Message.GREETINGS);

        final Scanner scanner = new Scanner(System.in);
        final String inputName = scanner.nextLine();

        final Player playerOne = new Human(inputName);
        final Player playerTwo = new Bot(BOT_NAME);

        final RockScissorsPaperGame game = new RockScissorsPaperGame(playerOne, playerTwo, 3);
        final GameResult gameResult = game.play();

        System.out.println("***" + gameResult.result() + "***");
    }
}
