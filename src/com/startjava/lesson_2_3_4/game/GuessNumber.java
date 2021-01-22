package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int guessNumber;
	Scanner sc = new Scanner(System.in);
	private Player plOne;
	private Player plTwo;
	Random randomNumber = new Random();
	int loopCounter;

	public GuessNumber(Player plOne, Player plTwo) {
		this.plOne = plOne;
		this.plTwo = plTwo;
	}

	public void start() {
		loopCounter = 0;
		plOne.setAttempt(loopCounter);
		plTwo.setAttempt(loopCounter);
		guessNumber = randomNumber.nextInt(100);
		System.out.println("A random number is guessed - " + guessNumber);

		while(true) {
			loopCounter++;
			if (validationAttemptsPlayer(loopCounter, plOne) && validationAttemptsPlayer(loopCounter, plTwo)) {
				if (plOne.getAttempts() == 10) {
					System.out.println("player " + plOne.getName() + " has run out of attempts");
				}
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

	private boolean validationAttemptsPlayer(int loopCounter, Player player) {
		if (loopCounter <= 10) {
			System.out.println("player " + player.getName() + " enter a number");
			player.setAttempt(loopCounter);
			player.setEnteredNumber(sc.nextInt());
		}

		boolean comapreNumber = ((loopCounter > 10) || (comapreNumber(player))) ? false : true;
		return comapreNumber;
	}

	private boolean comapreNumber(Player player) {
		if (player.getLastNumber() == guessNumber) {
			System.out.println("player " + player.getName() + " wins");
			System.out.println("player " + player.getName() + " guessed the number " + guessNumber + " on attempt " + player.getAttempts());
			return true;
		}
		System.out.println("player " + player.getName() + " entered wrong number");

		String messageComapreNumber = (player.getLastNumber() < guessNumber) ? "the number that player " + player.getName() + " entered is less than what the computer guessed" :
				"the number that player " + player.getName() + " entered is greater than what the computer guessed";
		System.out.println(messageComapreNumber);
		return false;
	}

	private void outputEnteredNumbers(Player player) {
		System.out.print("player " + player.getName() + " entered numbers - ");
		int [] enteredNumbers = player.getEnteredNumbers();
		for (int number : enteredNumbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
}