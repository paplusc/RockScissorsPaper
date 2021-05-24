package org.pcremades;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

public class AppIntegrationTest {

  @Test
  void playFullGameWithSuccess() {
    String[] args = null;
    String data = "pablo\r\nrock\r\npaper\r\nrock";
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream(data.getBytes()));

    App.main(args);
    System.setIn(stdin);

    // The assertions are having no exceptions
  }
}
