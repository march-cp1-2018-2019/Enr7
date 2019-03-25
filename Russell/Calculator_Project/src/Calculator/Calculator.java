package Calculator;

//Stephen Russell 3/29/19

public class Calculator {

	public static double calculate(char op, double a, double b) throws Exception {

		switch (op) {

		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':

			if (a == 0 || b == 0) {

				throw new Exception("Undefined, dividing by 0 is an unreal function.");
			}

			return a / b;
		default:
			throw new Exception("Unknown operator: " + op);

		}
	}
}
