package org.pcremades.players;

import org.pcremades.enums.Choice;

public class Bot extends Player {

  public Bot() {
    this.setName("Bot122254");
    this.setChoice(Choice.randomChoice());
  }
}
