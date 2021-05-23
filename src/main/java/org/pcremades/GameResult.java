package org.pcremades;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GameResult {

  private final List<RoundResult> roundResults;

  public GameResult(List<RoundResult> roundResults) {
    this.roundResults = roundResults;
  }

  public String result() {

    // Remove rounds with tie result
    List<String> resultReport = roundResults.stream().map(RoundResult::winner)
               .filter(Optional::isPresent)
               .map(Optional::get)
               .map(Player::name)
               .collect(Collectors.toList());

    if (resultReport.isEmpty()) {
      return "The final result is TIE!";
    }

    // Group and Count the wins of each player
    Map<String, Long> result = resultReport.stream().collect(Collectors.groupingBy(
                                     Function.identity(), Collectors.counting()));


    Iterator<Map.Entry<String, Long>> iterator = result.entrySet().iterator();
    Map.Entry<String, Long> firstPlayer = iterator.next();
    Map.Entry<String, Long> secondPlayer = iterator.next();

    if (firstPlayer.getValue() > secondPlayer.getValue()) {
      System.out.println("--------------------------------");
      return firstPlayer.getKey() + " is the final winner!";
    }
    else if (firstPlayer.getValue() < secondPlayer.getValue()) {
      System.out.println("--------------------------------");
      return secondPlayer.getKey() + " is the final winner!";
    } else {
      return "The final result is TIE!";
    }
  }
}
