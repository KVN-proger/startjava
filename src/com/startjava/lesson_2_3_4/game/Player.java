package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int number;
	private int [] enteredNumbers = new int[10];
	private int attempts;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public int[] getEnteredNumbers() {
		int [] fillNumbers = Arrays.copyOf(enteredNumbers, 10);
		return fillNumbers;
	}

	public void setEnteredNumbers(int number) {
		enteredNumbers [attempts - 1] = number;
	}

	public void fillEnteredNumbersNull () {
		Arrays.fill(enteredNumbers, 0, attempts, 0);
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
}