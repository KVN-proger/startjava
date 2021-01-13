package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String confirmation;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("enter a mathematical expression : 2 ^ 10");
			Calculator calc = new Calculator(sc.nextLine());
			System.out.println(calc.calculate());
			do {
				System.out.println("do you want to continue calculating? yes/no");
				confirmation = sc.next();
			} while (!confirmation.equals("yes") && !confirmation.equals("no"));
			sc.nextLine();
		} while (confirmation.equals("yes"));
		System.out.println("goodbay");
	}
}