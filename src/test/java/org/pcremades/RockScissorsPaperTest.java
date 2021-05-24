package org.pcremades;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.pcremades.mock.MockPlayerPaper;
import org.pcremades.mock.MockPlayerRock;
import org.pcremades.mock.MockPlayerScissors;

public class RockScissorsPaperTest {

  private final Player playerRock = new MockPlayerRock();

  private final Player playerPaper = new MockPlayerPaper();

  private final Player playerScissors = new MockPlayerScissors();

  @Nested
  class Play {
    @Test
    void oneRound() {
      RockScissorsPaperGame game = new RockScissorsPaperGame(playerRock, playerScissors, 1);

      GameResult gameResult = game.play();

      assertThat(gameResult.roundResults()).extracting(RoundResult::winner).containsOnly(Optional.of(playerRock));
    }
    @Test
    void fiveRounds() {
      RockScissorsPaperGame game = new RockScissorsPaperGame(playerPaper, playerScissors, 5);

      GameResult gameResult = game.play();

      assertThat(gameResult.roundResults()).extracting(RoundResult::winner).containsOnly(Optional.of(playerScissors),
                 Optional.of(playerScissors),
                 Optional.of(playerScissors),
                 Optional.of(playerScissors),
                 Optional.of(playerScissors));
    }
  }
}
