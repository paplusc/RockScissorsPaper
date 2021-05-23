package org.pcremades;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.pcremades.mock.MockPlayerPaper;
import org.pcremades.mock.MockPlayerRock;

public class GameResultTest {

  private final Player playerRock = new MockPlayerRock();
  private final Player playerPaper = new MockPlayerPaper();

  @Nested
  class Result {
    @Test
    void allRoundsTie() {
      List<RoundResult> roundResults = List.of(RoundResult.tie(), RoundResult.tie(),RoundResult.tie());
      GameResult gameResult = new GameResult(roundResults);

      String result = gameResult.result();

      assertThat(result).isEqualTo("The final result is TIE!");
    }
    @Test
    void playerOneHasMoreWins() {
      List<RoundResult> roundResults = List.of(RoundResult.wins(playerRock), RoundResult.wins(playerRock),
                 RoundResult.wins(playerPaper));
      GameResult gameResult = new GameResult(roundResults);

      String result = gameResult.result();

      assertThat(result).isEqualTo("MockPlayerRock is the final winner!");
    }
    @Test
    void twoTiesAndOnePlayerWin() {
      List<RoundResult> roundResults = List.of(RoundResult.tie(), RoundResult.tie(),
                 RoundResult.wins(playerPaper));
      GameResult gameResult = new GameResult(roundResults);

      String result = gameResult.result();

      assertThat(result).isEqualTo("MockPlayerPaper is the final winner!");
    }
  }
}
