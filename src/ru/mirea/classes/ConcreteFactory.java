package ru.mirea.classes;

import ru.mirea.interfaces.ComplexAbstractFactory;

public class ConcreteFactory implements ComplexAbstractFactory {
  /**
   * Создаёт комплексное число с нулевыми мнимыми и вещественными частями
   * @return            комплексное число вида 0 + 0i
   */
  public Complex createComplex() {
    return new Complex(0, 0);
  }

  /**
   * Создаёт комплексное число
   * @param real          вещественная часть
   * @param image         мнимая часть
   * @return              комплексное число вида real + image * i
   */
  public Complex createComplex(int real, int image) {
    return new Complex(real, image);
  }
}
