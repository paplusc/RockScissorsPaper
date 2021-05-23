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
    try {
      System.out.print(Message.PICK_ONE);
      return Choice.valueOf(scanner.nextLine().toUpperCase());

    } catch (IllegalArgumentException e) {
      System.out.println(Message.WRONG_INPUT);
      System.out.println(Message.TRY_AGAIN);
      System.out.println(Message.LINE);
      return choice();
    }
  }
}
