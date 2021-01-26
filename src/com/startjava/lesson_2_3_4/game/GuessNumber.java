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
		quantityAttempts = 0;
		plOne.setAttempt(quantityAttempts);
		plTwo.setAttempt(quantityAttempts);
		guessNumber = randomNumber.nextInt(100);
		System.out.println("A random number is guessed - " + guessNumber);

		while(true) {
			quantityAttempts++;
			if (makeMove(plOne)) {
				if (plOne.getAttempts() == 10) {
					System.out.println("player " + plOne.getName() + " has run out of attempts");
				}
			} else {
				break;
			}
			if 	(makeMove(plTwo)) {
				if (plTwo.getAttempts() == 10) {
					System.out.println("player " + plTwo.getName() + " has run out of attempts");
				}
			} else {
				break;
			}
		}
		outputEnteredNumbers(plOne);
		outputEnteredNumbers(plTwo);
		plOne.clearEnteredNumbers();
		plTwo.clearEnteredNumbers();
	}

	private boolean makeMove(Player player) {
		if (quantityAttempts <= 10) {
			System.out.println("player " + player.getName() + " enter a number");
			player.setAttempt(quantityAttempts);
			enterNumber(player);
		} else {
			return false;
		}

	boolean compareNumber = (compareNumber(player)) ?
			false : true;
		return compareNumber;
	}

	private void enterNumber (Player player) {
		player.setEnteredNumber(sc.nextInt());
	}

	private boolean compareNumber(Player player) {
		if (player.getLastNumber() == guessNumber) {
			System.out.println("player " + player.getName() + " wins");
			System.out.println("player " + player.getName() + " guessed the number " + guessNumber + " on attempt " + player.getAttempts());
			return true;
		}
		System.out.println("player " + player.getName() + " entered wrong number");

		String messageCompareNumber = (player.getLastNumber() < guessNumber) ?
			" entered is less than what the computer guessed" :
			" entered is greater than what the computer guessed";
		System.out.println("the number that player " + player.getName() + messageCompareNumber);
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