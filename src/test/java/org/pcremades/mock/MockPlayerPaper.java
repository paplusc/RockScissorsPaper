package org.pcremades.mock;

import org.pcremades.Choice;
import org.pcremades.Player;

public class MockPlayerPaper implements Player {
  @Override
  public String name() {
    return "MockPlayerPaper";
  }

  @Override
  public Choice choice() {
    return Choice.PAPER;
  }
}
