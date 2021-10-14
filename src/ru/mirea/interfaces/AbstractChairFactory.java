package ru.mirea.interfaces;

import ru.mirea.classes.VictorianChair;
import ru.mirea.classes.MagicalChair;
import ru.mirea.classes.FunctionalChair;

public interface AbstractChairFactory {
  /**
   * Создаёт викторианский стул
   */
  VictorianChair createVictorianChair(int age);

  /**
   * Создаёт магический стул
   */
  MagicalChair createMagicalChair();

  /**
   * Создаёт функциональный стул
   */
  FunctionalChair createFunctionalChair();
}
