package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {
	private int x;
	private int y;
	private char mathSign;
	private String mathStatement;
	public int result;

	public Calculator(String mathStatement) {
		this.mathStatement = mathStatement;
		String[] mathArray = mathStatement.split(" ");
		x = Integer.parseInt(mathArray[0]);
		mathSign = mathArray[1].charAt(0);
		y = Integer.parseInt(mathArray[2]);
	}

	public int getX() {
		return x;
	}

	public char getMathSign() {
		return mathSign;
	}

	public int getY() {
		return y;
	}

	public int calculate() {
		switch (mathSign) {
			case '+':
				result = addExact(x, y);
				break;
			case '-':
				result = subtractExact(x, y);
				break;
			case '*':
				result = multiplyExact(x, y);
				break;
			case '/':
				result = x / y;
				break;
			case '^':
				result = 1;
				for (int a = 0; a < y; a++) {
					result *= x;
				}
				break;
			case '%':
				result = x % y;
				break;
		}
		return result;
	}
}
