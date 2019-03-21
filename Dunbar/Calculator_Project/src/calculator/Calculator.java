package calculator;

// Noah 2/18/2019

public class Calculator{
  public static double calculate(char op, double a, double b) throws Exception{
    switch(op){
    case '+':
      return a + b;
    case '-':
      return a - b;
    case '*':
      return a * b;
    case '/':
      if(a == 0 || b == 0) {
        throw new Exception("Cannot devide by 0. Nice try :)");
      }
      return a / b;
     default:
       throw new Exception("Unknown operator: " + op);
    }
  }
}
