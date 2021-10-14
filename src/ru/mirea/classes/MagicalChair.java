package ru.mirea.classes;

import ru.mirea.interfaces.Chair;

public class MagicalChair implements Chair {
  /**
   * Кастует НЕВЕРОЯТНОЕ заклинание
   */
  public void doMagic() throws Exception {
    System.out.println("Магия: *происходит*");
    throw new Exception("[ERROR]: Ой, не то заклинание))");
  }

  /**
   * Объединяет информацию об объекте в одну строку
   * @return        строка с общей информацией об объекте
   */
  @Override
  public String toString() {
    return """
      MagicalChair {
        заклинание: выдача ошибки
      }""";
  }
}
