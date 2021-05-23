package org.pcremades.mock;

import org.pcremades.Choice;
import org.pcremades.Player;

public class MockPlayerScissors implements Player {
  @Override
  public String name() {
    return "MockPlayerScissors";
  }

  @Override
  public Choice choice() {
    return Choice.SCISSORS;
  }
}
