package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int guessNumber;
	Scanner sc = new Scanner(System.in);
	private Player plOne;
	private Player plTwo;
	Random randomNumber = new Random();
	int quantityAttempts;

	public GuessNumber(Player plOne, Player plTwo) {
		this.plOne = plOne;
		this.plTwo = plTwo;
	}

	public void start() {
		guessNumber = randomNumber.nextInt(101);
		System.out.println("A random number is guessed - " + guessNumber);

		while(true) {
			quantityAttempts++;
			if (makeMove(plOne)) {
			} else {
				break;
			}
			if (makeMove(plTwo)) {
			} else {
				break;
			}
		}
		outputEnteredNumbers(plOne);
		outputEnteredNumbers(plTwo);
		plOne.clearEnteredNumbers();
		plTwo.clearEnteredNumbers();
		quantityAttempts = 0;
		plOne.setAttempt(quantityAttempts);
		plTwo.setAttempt(quantityAttempts);
	}

	private boolean makeMove(Player player) {
		if (quantityAttempts <= 10) {
			enterNumber(player);
		} else {
			return false;
		}
		if (compareNumber(player)) {
			return false;
		}
		if (player.getAttempts() == 10) {
			System.out.println("player " + player.getName() + " has run out of attempts");
		}
		return true;
	}

	private void enterNumber(Player player) {
		System.out.println("player " + player.getName() + " enter a number");
		player.setEnteredNumber(sc.nextInt());
		player.setAttempt(quantityAttempts);
	}

	private boolean compareNumber(Player player) {
		if (player.getLastNumber() == guessNumber) {
			System.out.println("player " + player.getName() + " wins");
			System.out.println("player " + player.getName() + " guessed the number " + guessNumber + " on attempt " + player.getAttempts());
			return true;
		}
		System.out.println("player " + player.getName() + " entered wrong number");

		String messageCompareNumber = (player.getLastNumber() < guessNumber) ? "less" : "greater";
		System.out.println("the number that player " + player.getName() + " entered is " + messageCompareNumber + " than what the computer guessed");
		return false;
	}

	private void outputEnteredNumbers(Player player) {
		System.out.print("player " + player.getName() + " entered numbers - ");
		int[] enteredNumbers = player.getEnteredNumbers();
		for (int number : enteredNumbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
}