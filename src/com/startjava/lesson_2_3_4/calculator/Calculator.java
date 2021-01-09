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
	}
	public String getMathStatement() {
		return mathStatement;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setMathSign(char mathSign) {
		this.mathSign = mathSign;
	}

	public char getMathSign() {
		return mathSign;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
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
