package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int[] enteredNumbers = new int[10];
	private int attempts;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		int number = 0;
		for (int i: enteredNumbers) {
			i = enteredNumbers[attempts - 1];
			number = i;
		}
		return number;
	}

	public int[] getEnteredNumbers() {
		return Arrays.copyOf(enteredNumbers, attempts);
	}

	public void setEnteredNumber(int number) {
		enteredNumbers[attempts - 1] = number;
	}

	public void fillEnteredNumbersNull() {
		Arrays.fill(enteredNumbers, 0, attempts, 0);
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempt(int attempts) {
		this.attempts = attempts;
	}
}