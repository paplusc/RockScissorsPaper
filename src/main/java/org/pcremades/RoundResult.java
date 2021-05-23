package org.pcremades;

import java.util.Optional;

public class RoundResult {

  private final Player winner;

  public RoundResult(Player winner) {
    this.winner = winner;
  }

  public Optional<Player> winner() {
    return Optional.ofNullable(winner);
  }

  public static RoundResult wins(Player player) {
    return new RoundResult(player);
  }

  public static RoundResult tie() {
    return new RoundResult(null);
  }
}
