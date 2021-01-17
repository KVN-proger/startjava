package com.startjava.lesson_2_3_4.game;

public class Player {
	private String name;
	private int number;
	private int [] numbersPlayer = new int[10];
	private int attempts = 0;

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

	public int[] getNumbersPlayer() {
		return numbersPlayer;
	}

	public void setNumbersPlayer(int[] numbersPlayer) {
		this.numbersPlayer = numbersPlayer;
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
}