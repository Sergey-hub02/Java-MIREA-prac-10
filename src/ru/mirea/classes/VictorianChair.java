package ru.mirea.classes;

import ru.mirea.interfaces.Chair;

public class VictorianChair implements Chair {
  private final int age;

  /**
   * Создаёт викторианский стул с заданным возрастом
   * @param age           возраст стула
   */
  public VictorianChair(int age) {
    this.age = age;
  }

  /**
   * Геттер для поля age
   * @return            возраст стула
   */
  public int getAge() {
    return this.age;
  }

  /**
   * Объединяет информацию об объекте в одну строку
   * @return        строка с общей информацией об объекте
   */
  @Override
  public String toString() {
    return (
      "VictorianChair {\n"
            + "  age: " + this.age + "\n"
            + "}"
    );
  }
}
