package org.pcremades;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * The Game Result.
 * Logic where the game will determinate who has more wins in a list of played rounds.
 */
public class GameResult {

  private final List<RoundResult> roundResults;

  public GameResult(List<RoundResult> roundResults) {
    this.roundResults = roundResults;
  }

  public List<RoundResult> roundResults() {
    return roundResults;
  }

  public String result() {

    List<String> winners = buildListOfWinners();

    if (winners.isEmpty()) {
      return Message.FINAL_TIE;
    }

    Map<String, Long> resultReport = winners.stream().collect(Collectors.groupingBy(
                                     Function.identity(), Collectors.counting()));


    // Divide the two players and check which one has more wins.
    Iterator<Map.Entry<String, Long>> iterator = resultReport.entrySet().iterator();
    Map.Entry<String, Long> firstPlayer = iterator.next();
    if(!iterator.hasNext()) {
      return firstPlayer.getKey() + Message.FINAL_WINNER;
    }
    Map.Entry<String, Long> secondPlayer = iterator.next();

    if (firstPlayer.getValue() > secondPlayer.getValue()) {
      return firstPlayer.getKey() + Message.FINAL_WINNER;
    }
    else if (firstPlayer.getValue() < secondPlayer.getValue()) {
      return secondPlayer.getKey() + Message.FINAL_WINNER;
    } else {
      return Message.FINAL_TIE;
    }
  }

  private List<String> buildListOfWinners() {
    return roundResults.stream().map(RoundResult::winner)
               .filter(Optional::isPresent)
               .map(Optional::get)
               .map(Player::name)
               .collect(Collectors.toList());
  }
}
