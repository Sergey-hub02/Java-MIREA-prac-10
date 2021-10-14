package ru.mirea.classes;

public class Complex {
  private int re;           // вещественная часть (int - потому что в UML диаграмме так указано)
  private int im;           // мнимая часть (int - потому что в UML диаграмме так указано)

  /**
   * Создаёт комплексное число и вещественной частью, и с мнимой
   * @param re        вещественная часть
   * @param im        мнимая часть
   */
  public Complex(int re, int im) {
    this.re = re;
    this.im = im;
  }

  /**
   * Геттер для поля re
   * @return          вещественная часть
   */
  public int getRe() {
    return this.re;
  }

  /**
   * Геттер для поля im
   * @return          мнимая часть
   */
  public int getIm() {
    return this.im;
  }

  /**
   * Сеттер для поля re
   * @param re        новое значение вещественной части
   */
  public void setRe(int re) {
    this.re = re;
  }

  /**
   * Сеттер для поля im
   * @param im        новое значение мнимой части
   */
  public void setIm(int im) {
    this.im = im;
  }

  /**
   * Возвращает строковое представление комплексного числа
   * @return           строка вида re + im * i
   */
  @Override
  public String toString() {
    return this.re + " + " + this.im + "i";
  }
}
