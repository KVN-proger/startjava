package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String confirmation;
		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		String str;

		do {
			System.out.println("enter a mathematical expression : 2 ^ 10");
			str = (sc.nextLine());
			String[] mathStatement = str.split(" ");

			while (mathStatement[0].equals("")) {
				str = (sc.nextLine());
				mathStatement = str.split(" ");
			}
			calc.setX(Integer.parseInt(mathStatement[0]));
			calc.setMathSign(mathStatement[1].charAt(0));
			calc.setY(Integer.parseInt(mathStatement[2]));
			calc.calculate();

			do {
				System.out.println("do you want to continue calculating? yes/no");
				confirmation = sc.next();
			} while (!confirmation.equals("yes") && !confirmation.equals("no"));
		} while (confirmation.equals("yes"));
		System.out.println("goodbay");
	}
}