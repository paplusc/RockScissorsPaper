package org.pcremades;

import java.util.Random;

public class Bot implements Player {

  private final String name;

  public Bot(String name) {
    this.name = name;
  }

  @Override
  public String name() {
    return this.name;
  }

  @Override
  public Choice choice() {
    return Choice.values()[new Random().nextInt(3)];
  }
}
