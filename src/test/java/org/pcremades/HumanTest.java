package org.pcremades;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class HumanTest {

  @Nested
  class GetChoice {
    @Test
    void rock() {
      String data = "rock\r\n";
      InputStream stdin = System.in;
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      Player player = new Human("NameTest");

      Choice choice = player.choice();
      System.setIn(stdin);

      assertThat(choice).isEqualTo(Choice.ROCK);
    }
    @Test
    void paper() {
      String data = "paper\r\n";
      InputStream stdin = System.in;
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      Player player = new Human("NameTest");

      Choice choice = player.choice();
      System.setIn(stdin);

      assertThat(choice).isEqualTo(Choice.PAPER);
    }
    @Test
    void scissors() {
      String data = "scissors\r\n";
      InputStream stdin = System.in;
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      Player player = new Human("NameTest");

      Choice choice = player.choice();
      System.setIn(stdin);

      assertThat(choice).isEqualTo(Choice.SCISSORS);
    }
    @Test
    void invalidArgument() {
      String data = "XXX\r\nscissors";
      InputStream stdin = System.in;
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      Player player = new Human("NameTest");

      Choice choice = player.choice();
      System.setIn(stdin);

      assertThat(choice).isEqualTo(Choice.SCISSORS);
    }
  }
}
