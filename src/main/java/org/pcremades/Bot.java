package org.pcremades;

import java.util.Random;

/**
 * The Bot.
 * A new random choice between rock-scissors-paper will be generate when calling choice method
 */
public class Bot implements Player {

  private final String name;

  private final Random random;

  public Bot(String name) {
    this.name = name;
    this.random = new Random();
  }

  @Override
  public String name() {
    return this.name;
  }

  @Override
  public Choice choice() {
    return Choice.values()[random.nextInt(3)];
  }
}
