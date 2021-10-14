package ru.mirea;

import java.util.Scanner;
import ru.mirea.classes.*;


public class ComplexTest {
  private static final Scanner IN = new Scanner(System.in);
  private static final ConcreteFactory FACTORY = new ConcreteFactory();

  public static void main(String[] args) {
    System.out.print("Введите вещественную часть (целое число): ");
    int real = IN.nextInt();

    System.out.print("Введите мнимую часть (целое число): ");
    int image = IN.nextInt();

    Complex z1 = FACTORY.createComplex();
    Complex z2 = FACTORY.createComplex(real, image);

    System.out.println("z1 = " + z1);
    System.out.println("z2 = " + z2);
  }
}
