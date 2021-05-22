package org.pcremades.display;

import org.pcremades.players.Player;

public class UserInterfaceImpl implements UserInterface{

  @Override
  public void greetings() {
    System.out.println("--------------------------------------");
    System.out.println("   ROCK-SCISSORS-PAPER, Let's play!   ");
    System.out.println("--------------------------------------");
    System.out.print("Welcome player, what is your name? ");
  }

  @Override
  public void askChoice() {
    System.out.print("Pick wisely -> ROCK-SCISSORS-PAPER: ");
  }

  @Override
  public void playerChoice(Player player) {
    System.out.println(player.getName() + " -> " + player.getChoice());
  }

  @Override
  public void gameResult(Player player) {
    System.out.println("--------------------------------------");
    System.out.println(player.getName() + " wins!");
  }
}
