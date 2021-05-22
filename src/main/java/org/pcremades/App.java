package org.pcremades;

import java.util.Scanner;

import org.pcremades.display.UserInterface;
import org.pcremades.display.UserInterfaceImpl;
import org.pcremades.enums.Choice;
import org.pcremades.players.Bot;
import org.pcremades.players.Human;
import org.pcremades.players.Player;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner scanner = new Scanner(System.in);
    private static UserInterface display = new UserInterfaceImpl();

    public static void main( String[] args )
    {
        display.greetings();
        String inputName = scanner.nextLine();

        display.askChoice();
        String inputChoice = scanner.nextLine();

        Player playerOne = new Human(inputName, Choice.valueOf(inputChoice.toUpperCase()));
        Player bot = new Bot();

        display.playerChoice(playerOne);
        display.playerChoice(bot);

        Game game = new Game(playerOne, bot);
        Player winner = game.play();

        if(winner != null) {
            display.gameResult(winner);
        } else {
            System.out.println("It's a tie!");
        }
    }
}
