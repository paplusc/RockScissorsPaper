package org.pcremades.mock;

import org.pcremades.Choice;
import org.pcremades.Player;

public class MockPlayerRock implements Player {
  @Override
  public String name() {
    return "MockPlayerRock";
  }

  @Override
  public Choice choice() {
    return Choice.ROCK;
  }
}
