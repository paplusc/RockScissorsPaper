package org.pcremades.players;

import org.pcremades.enums.Choice;

public abstract class Player {

  private String name;
  private Choice choice;

  public Player() {}

  public Player(String name, Choice choice) {
    this.name = name;
    this.choice = choice;
  }

  public Choice getChoice() {
    return choice;
  }

  public void setChoice(Choice choice) {
    this.choice = choice;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
