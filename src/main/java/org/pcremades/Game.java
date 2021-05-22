package org.pcremades;

import org.pcremades.enums.Choice;
import org.pcremades.players.Player;

public class Game {

  private Player playerOne;
  private Player playerTwo;

  public Game(final Player playerOne, final Player playerTwo) {
    this.playerOne = playerOne;
    this.playerTwo = playerTwo;
  }

  public Player play() {
    if(playerOne.getChoice().equals(Choice.ROCK) && playerTwo.getChoice().equals(Choice.SCISSORS)) {
      return playerOne;
    }
    if(playerOne.getChoice().equals(Choice.ROCK) && playerTwo.getChoice().equals(Choice.PAPER)) {
      return playerTwo;
    }
    if(playerOne.getChoice().equals(Choice.SCISSORS) && playerTwo.getChoice().equals(Choice.ROCK)) {
      return playerTwo;
    }
    if(playerOne.getChoice().equals(Choice.PAPER) && playerTwo.getChoice().equals(Choice.ROCK)) {
      return playerOne;
    }
    return null;
  }
}
