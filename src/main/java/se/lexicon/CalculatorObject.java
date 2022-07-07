package se.lexicon;

public class CalculatorObject implements Calculator{
    String plus = "+";
    String minus = "-";
    String multi = "*";
    String divi = "/";
    @Override
    public double addition(double num1, double num2) {
        return num1+num2;
    }

    @Override
    public double subtraction(double num1, double num2) {
        return num1-num2;
    }

    @Override
    public double multiplication(double num1, double num2) {
        return num1*num2;
    }

    @Override
    public double division(double num1, double num2) {
        return num1/num2;
    }

    @Override
    public double calculate() {
        if (helpSign().equalsIgnoreCase("+")) {
            double a = help();
            double b = help();
            return  addition(a, b);
        } else if ((helpSign().equalsIgnoreCase("-"))){
            double a = help();
            double b = help();
            return subtraction(a, b);
        } else if ((helpSign().equalsIgnoreCase("*"))){
            double a = help();
            double b = help();
            return multiplication(a, b);
        } else if ((helpSign().equalsIgnoreCase("/"))){
            double a = help();
            double b = help();
            return division(a, b);
        }
        return 0;
    }

    public String helpSign(){
        System.out.print("Choose +, -, * or / for the calculator: ");
        return scan.nextLine();
    }
    public double help(){
        System.out.print("Choose a number for the calculator: ");
        return scan.nextInt();
    }
}
