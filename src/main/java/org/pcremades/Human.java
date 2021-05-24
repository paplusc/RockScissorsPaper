package org.pcremades;

import java.util.Scanner;

/**
 * The Human.
 * A new input will be asked to the user in the console every time we call the choice method.
 */
public class Human implements Player {

  private final String name;

  private final Scanner scanner;

  public Human(String name, Scanner scanner) {
    this.name = name;
    this.scanner = scanner;
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
