package se.lexicon;

import java.util.Scanner;

public interface Calculator {
    Scanner scan = new Scanner(System.in);
    double addition(double num1, double num2);
    double subtraction(double num1, double num2);
    double multiplication(double num1, double num2);
    double division(double num1, double num2);
    default double calculate(){
        return 0;
    }
}
