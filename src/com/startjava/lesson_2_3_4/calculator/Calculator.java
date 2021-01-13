package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {
	private int x;
	private int y;
	private char mathSign;

	public Calculator(String mathExpression) {
		String[] splitMathExpression = mathExpression.split(" ");
		x = Integer.parseInt(splitMathExpression[0]);
		mathSign = splitMathExpression[1].charAt(0);
		y = Integer.parseInt(splitMathExpression[2]);
	}

	public int calculate() {
		verifyMathSign();
		switch (mathSign) {
			case '+':
				return addExact(x, y);
			case '-':
				return subtractExact(x, y);
			case '*':
				return multiplyExact(x, y);
			case '/':
				return x / y;
			case '^':
				return (int) pow(x, y);
			case '%':
				return x % y;
			}
		return 0;
	}

	public void verifyMathSign() {
		if (mathSign == '+' || mathSign == '-' || mathSign == '*' || mathSign == '/' || mathSign == '%') {
			System.out.print(x + " " + mathSign + " " + y + " = ");
		} else if (mathSign == '^') {
			System.out.print("exponentiation " + y + " number " + x + " = ");
		}
	}
}
