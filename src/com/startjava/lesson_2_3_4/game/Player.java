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

	public int getLastNumber() {
		return enteredNumbers[attempts - 1];
	}

	public int[] getEnteredNumbers() {
		return Arrays.copyOf(enteredNumbers, attempts);
	}

	public void setEnteredNumber(int number) {
		enteredNumbers[attempts - 1] = number;
	}

	public void clearEnteredNumbers() {
		Arrays.fill(enteredNumbers, 0, attempts, 0);
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempt(int attempts) {
		this.attempts = attempts;
	}
}