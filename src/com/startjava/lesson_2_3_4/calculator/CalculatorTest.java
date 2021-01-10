package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String confirmation;
		Scanner sc = new Scanner(System.in);
		String str;

		do {
			str = null;
			System.out.println("enter a mathematical expression : 2 ^ 10");

			while (str == null || str.equals("")) {
				str = sc.nextLine();
			}
			Calculator calc = new Calculator(str);
			if (calc.getMathSign() == '+' || calc.getMathSign() == '-' || calc.getMathSign() == '*' || calc.getMathSign() == '/' || calc.getMathSign() == '%') {
				System.out.println(calc.getX() + " " + calc.getMathSign() + " " + calc.getY() + " = " + calc.calculate());
			} else if (calc.getMathSign() == '^') {
				System.out.println("exponentiation " + calc.getY() + " number " + calc.getX() + " = " + calc.calculate());
			}
			do {
				System.out.println("do you want to continue calculating? yes/no");
				confirmation = sc.next();
			} while (!confirmation.equals("yes") && !confirmation.equals("no"));
		} while (confirmation.equals("yes"));
		System.out.println("goodbay");
	}
}