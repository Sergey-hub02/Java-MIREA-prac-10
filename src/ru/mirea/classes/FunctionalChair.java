package ru.mirea.classes;

import ru.mirea.interfaces.Chair;

public class FunctionalChair implements Chair {
  /**
   * Складывает два целых числа
   * @param a           первое слагаемое
   * @param b           второе слагаемое
   * @return            сумма двух чисел
   */
  public int sum(int a, int b) {
    return a + b;
  }

  /**
   * Объединяет информацию об объекте в одну строку
   * @return        строка с общей информацией об объекте
   */
  @Override
  public String toString() {
    return "FunctionalChair {Ммм, этот функциональный стул...}";
  }
}
