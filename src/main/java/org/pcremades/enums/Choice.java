package org.pcremades.enums;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Choice {
  ROCK,
  SCISSORS,
  PAPER;

  private static final List<Choice> VALUES = Collections.unmodifiableList(List.of(values()));
  private static final int SIZE = VALUES.size();
  private static final Random RANDOM = new Random();

  public static Choice randomChoice()  {
    return VALUES.get(RANDOM.nextInt(SIZE));
  }
}
