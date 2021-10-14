package ru.mirea.interfaces;

import ru.mirea.classes.Complex;

public interface ComplexAbstractFactory {
  /**
   * Создаёт комплексное число с нулевыми мнимыми и вещественными частями
   * @return            комплексное число вида 0 + 0i
   */
  Complex createComplex();

  /**
   * Создаёт комплексное число
   * @param real          вещественная часть
   * @param image         мнимая часть
   * @return              комплексное число вида real + image * i
   */
  Complex createComplex(int real, int image);
}
