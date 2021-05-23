package org.pcremades;

import java.util.Scanner;

public class Human implements Player {

  private final String name;
  private final Scanner scanner;

  public Human(String name) {
    this.name = name;
    this.scanner = new Scanner(System.in);
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public Choice choice() {
    System.out.print("Pick wisely -> ROCK-SCISSORS-PAPER: ");
    return Choice.valueOf(scanner.nextLine().toUpperCase());
  }
}
