package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {
	private int x;
	private int y;
	private char mathSign;
	public int result;

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setMathSign(char mathSign) {
		this.mathSign = mathSign;
	}

	public void calculate() {
		switch (mathSign) {
			case '+' :
				result = addExact(x, y);
				System.out.println("sum " + x + " + " + y + " = " + result);
				break;
			case '-' :
				result = subtractExact(x, y);
				System.out.println("subtraction " + x + " - " + y + " = " + result);
				break;
			case '*' :
				result = multiplyExact(x, y);
				System.out.println("multiplication " + x + " * " + y + " = " + result);
				break;
			case '/' :
				result = y / x;
				System.out.println("div " + y + " / " + x + " = " + result);
				break;
			case '^' :
				result = 1;
				for (int a = 0; a < y; a++) {
					result *= x;
				}
				System.out.println("exponentiation " + y + " number " + x + " = " + result);
				break;
			case '%' :
				result = y % x;
				System.out.println("remainder of division " + y + " % " + x + " = " + result);
				break;
		}
	}
}