package ru.mirea;

import ru.mirea.classes.Client;

public class ChairTest {
  public static void main(String[] args) {
    Client cl = new Client();

    try {
      cl.sit();
    }
    catch (Exception exc) {
      System.out.println(exc.getMessage());
    }
  }
}
