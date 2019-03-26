/**
 * Abby DuBose
 * Mar 21, 2019
 */
package calc;


public class Calculator {

	private double num1 = 0;
	private double num2 = 0;
	private String type;

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setNum1(2);
		double answer = c.div();
		System.out.println(answer);
	}

	public double add(){
		return num1 + num2;
		
	}
	
	public double sub() {
		return num1 - num2;
	}

	public double div() {
		if(num2 > 0) {
			return num1 / num2;
		} else {
			return 0;
		}
	}
	
	public double mul() {
		return num1 * num2;
	}

	public void clear() {
		num1 = 0;
		num2 = 0;


	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

}

