package org.pcremades.display;

import org.pcremades.players.Player;

public interface UserInterface {
  void greetings();
  void askChoice();
  void playerChoice(Player player);
  void gameResult(Player player);
}
