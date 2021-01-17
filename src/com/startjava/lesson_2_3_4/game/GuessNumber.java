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
	int[] fillPlayerOneNumbers = new int[10];
	int[] fillPlayerTwoNumbers = new int[10];
	int i;

	public GuessNumber(Player plOne, Player plTwo) {
		this.plOne = plOne;
		this.plTwo = plTwo;
	}

	public void start() {
		int i = 0;
		Arrays.fill(fillPlayerOneNumbers, 0, plOne.getAttempts(), 0);
		Arrays.fill(fillPlayerTwoNumbers, 0, plTwo.getAttempts(), 0);
		plOne.setNumbersPlayer(fillPlayerOneNumbers);
		plTwo.setNumbersPlayer(fillPlayerTwoNumbers);
		guessNumber = randomNumber.nextInt(100);
		System.out.println("A random number is guessed - " + guessNumber);

		while(true) {
			i++;
			if (gamePlayer(i, plOne, fillPlayerOneNumbers) && gamePlayer(i, plTwo, fillPlayerTwoNumbers)) {
				if (plOne.getAttempts() == 10) {
					System.out.println("player " + plOne.getName() + " has run out of attempts");
				}
				if (plTwo.getAttempts() == 10) {
					System.out.println("player " + plTwo.getName() + " has run out of attempts");
				}
			} else {
				plOne.setNumbersPlayer(fillPlayerOneNumbers);
				plTwo.setNumbersPlayer(fillPlayerTwoNumbers);
				break;
			}
		}
	}

	public boolean verifyGuessNumber(int playerNumber, int guessNumber, int playerAttemps, String playerName) {
		if (playerNumber == guessNumber) {
			System.out.println("player " + playerName + " wins");
			System.out.println("player " + playerName + " guessed the number " + guessNumber + " on attempt " + playerAttemps);
			return true;
		}
		System.out.println("player " + playerName + " entered wrong number");

		if (playerNumber < guessNumber) {
			System.out.println("the number that player " + playerName + " entered is less than what the computer guessed");
		} else {
			System.out.println("the number that player " + playerName + " entered is greater than what the computer guessed");
		}
		return false;
	}

	public boolean gamePlayer(int i, Player player, int[] playerNumbers) {
		if (i <= 10) {
			System.out.println("player " + player.getName() + " enter a number");
			player.setNumber(sc.nextInt());
			playerNumbers[i - 1] = player.getNumber();
			player.setAttempts(i);
		}
		
		if (i > 10) {
			return false;
		}
		
		if (verifyGuessNumber(player.getNumber(), guessNumber, player.getAttempts(), player.getName())) {
			return false;
		} else {
			return true;
		}
	}
}