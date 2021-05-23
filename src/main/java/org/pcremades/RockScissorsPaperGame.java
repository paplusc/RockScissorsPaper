package org.pcremades;

import java.util.ArrayList;
import java.util.List;


public class RockScissorsPaperGame implements Game {

  private final Player playerOne;
  private final Player playerTwo;
  private final Integer numberOfRounds;
  private final List<RoundResult> roundResults;

  public RockScissorsPaperGame(Player playerOne, Player playerTwo, Integer numberOfRounds) {
    this.playerOne = playerOne;
    this.playerTwo = playerTwo;
    this.numberOfRounds = numberOfRounds;
    this.roundResults = new ArrayList<>();
  }

  @Override
  public GameResult play(){
    for (int round = 1; round <= numberOfRounds; round++) {
      playRound();
    }

    return new GameResult(roundResults);
  }

  private void playRound() {
    Choice playerOneChoice = playerOne.choice();
    Choice playerTwoChoice = playerTwo.choice();

    if (playerOneChoice == Choice.ROCK && playerTwoChoice == Choice.SCISSORS) {
      System.out.println(playerOne.name() + " -> " + playerOneChoice);
      System.out.println(playerTwo.name() + " -> " + playerTwoChoice);
      System.out.println(playerOne.name() + " wins.");
      roundResults.add(RoundResult.wins(playerOne));

    } else if (playerOneChoice == Choice.ROCK && playerTwoChoice == Choice.PAPER) {
      System.out.println(playerOne.name() + " -> " + playerOneChoice);
      System.out.println(playerTwo.name() + " -> " + playerTwoChoice);
      System.out.println(playerTwo.name() + " wins.");
      roundResults.add(RoundResult.wins(playerTwo));

    } else if (playerOneChoice == Choice.SCISSORS && playerTwoChoice == Choice.ROCK) {
      System.out.println(playerOne.name() + " -> " + playerOneChoice);
      System.out.println(playerTwo.name() + " -> " + playerTwoChoice);
      System.out.println(playerTwo.name() + " wins.");
      roundResults.add(RoundResult.wins(playerTwo));

    } else if (playerOneChoice == Choice.PAPER && playerTwoChoice == Choice.ROCK) {
      System.out.println(playerOne.name() + " -> " + playerOneChoice);
      System.out.println(playerTwo.name() + " -> " + playerTwoChoice);
      System.out.println(playerOne.name() + " wins.");
      roundResults.add(RoundResult.wins(playerOne));

    } else {
      System.out.println(playerOne.name() + " -> " + playerOneChoice);
      System.out.println(playerTwo.name() + " -> " + playerTwoChoice);
      System.out.println("It's a tie!");
      roundResults.add(RoundResult.tie());
    }
  }
}
