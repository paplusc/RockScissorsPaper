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
  public GameResult play() {
    for (int round = 1; round <= numberOfRounds; round++) {
      playRound();
    }
    return new GameResult(roundResults);
  }

  private void playRound() {
    Choice playerOneChoice = playerOne.choice();
    Choice playerTwoChoice = playerTwo.choice();

    if ((playerOneChoice == Choice.ROCK && playerTwoChoice == Choice.SCISSORS) ||
        (playerOneChoice == Choice.PAPER && playerTwoChoice == Choice.ROCK) ||
        (playerOneChoice == Choice.SCISSORS && playerTwoChoice == Choice.PAPER)) {

      printPlayerResult(playerOne.name(), playerOneChoice);
      printPlayerResult(playerTwo.name(), playerTwoChoice);
      printWinner(playerOne.name());
      System.out.println(Message.LINE);

      roundResults.add(RoundResult.wins(playerOne));

    } else if ((playerOneChoice == Choice.ROCK && playerTwoChoice == Choice.PAPER) ||
               (playerOneChoice == Choice.SCISSORS && playerTwoChoice == Choice.ROCK) ||
               (playerOneChoice == Choice.PAPER && playerTwoChoice == Choice.SCISSORS)) {

      printPlayerResult(playerOne.name(), playerOneChoice);
      printPlayerResult(playerTwo.name(), playerTwoChoice);
      printWinner(playerTwo.name());
      System.out.println(Message.LINE);

      roundResults.add(RoundResult.wins(playerTwo));

    } else {
      printPlayerResult(playerOne.name(), playerOneChoice);
      printPlayerResult(playerTwo.name(), playerTwoChoice);
      System.out.println(Message.TIE);
      System.out.println(Message.LINE);
      roundResults.add(RoundResult.tie());
    }
  }

  private void printPlayerResult(final String player, final Choice choice) {
    System.out.println(player + " -> " + choice);
  }

  private void printWinner(final String name) {
    System.out.println(name + Message.WINS);
  }
}
