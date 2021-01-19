package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int guessNumber;
	Scanner sc = new Scanner(System.in);
	private Player plOne;
	private Player plTwo;
	Random randomNumber = new Random();
	int i;

	public GuessNumber(Player plOne, Player plTwo) {
		this.plOne = plOne;
		this.plTwo = plTwo;
	}

	public void start() {
		i = 0;
		plOne.setAttempts(i);
		plTwo.setAttempts(i);
		guessNumber = randomNumber.nextInt(100);
		System.out.println("A random number is guessed - " + guessNumber);

		while(true) {
			i++;
			if (gamePlayer(i, plOne) && gamePlayer(i, plTwo)) {
				if (plOne.getAttempts() == 10) {
					System.out.println("player " + plOne.getName() + " has run out of attempts");
				}
				if (plTwo.getAttempts() == 10) {
					System.out.println("player " + plTwo.getName() + " has run out of attempts");
				}
			} else {
				outputEnteredNumbers(plOne);
				outputEnteredNumbers(plTwo);
				break;
			}
		}
		plOne.fillEnteredNumbersNull();
		plTwo.fillEnteredNumbersNull();
	}

	public boolean comapreNumber(Player player) {
		if (player.getNumber() == guessNumber) {
			System.out.println("player " + player.getName() + " wins");
			System.out.println("player " + player.getName() + " guessed the number " + guessNumber + " on attempt " + player.getAttempts());
			return true;
		}
		System.out.println("player " + player.getName() + " entered wrong number");

		if (player.getNumber() < guessNumber) {
			System.out.println("the number that player " + player.getName() + " entered is less than what the computer guessed");
		} else {
			System.out.println("the number that player " + player.getName() + " entered is greater than what the computer guessed");
		}
		return false;
	}

	public boolean gamePlayer(int i, Player player) {
		if (i <= 10) {
			System.out.println("player " + player.getName() + " enter a number");
			player.setNumber(sc.nextInt());
			player.setAttempts(i);
			player.setEnteredNumbers(player.getNumber());
		}
		
		if (i > 10) {
			return false;
		}
		
		if (comapreNumber(player)) {
			return false;
		} else {
			return true;
		}
	}
	public void outputEnteredNumbers(Player player) {
		System.out.print("player " + player.getName() + " entered numbers - ");
		int [] enteredNumbers = Arrays.copyOf(player.getEnteredNumbers(), player.getAttempts());
		for (int i:enteredNumbers) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}