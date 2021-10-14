package ru.mirea.classes;

import ru.mirea.interfaces.AbstractChairFactory;

public class ChairFactory implements AbstractChairFactory {
  /**
   * Создаёт викторианский стул
   */
  public VictorianChair createVictorianChair(int age) {
    return new VictorianChair(10);
  }

  /**
   * Создаёт магический стул
   */
  public MagicalChair createMagicalChair() {
    return new MagicalChair();
  }

  /**
   * Создаёт функциональный стул
   */
  public FunctionalChair createFunctionalChair() {
    return new FunctionalChair();
  }
}
