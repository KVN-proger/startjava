import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int guessNumber;
	Scanner sc = new Scanner(System.in);
	private Player plOne;
	private Player plTwo;
	Random randomNumber = new Random();

	public GuessNumber(Player plOne, Player plTwo) {
		this.plOne = plOne;
		this.plTwo = plTwo;
	}

	public void start() {
		guessNumber = randomNumber.nextInt(100);
		System.out.println("A random number is guessed - " + guessNumber);

		do {
			System.out.println("player " + plOne.getName() + " enter a number");
			plOne.setNumber(sc.nextInt());
			System.out.println("player " + plOne.getName() + " entered a number - " + plOne.getNumber());
			if (plOne.getNumber() == guessNumber) {
				System.out.println("player " + plOne.getName() + " wins");
				break;
			}
			System.out.println("player " + plOne.getName() + " entered wrong number");
			if (plOne.getNumber() < guessNumber) {
				System.out.println("the number that player " + plOne.getName() + " entered is less than what the computer guessed");
			} else {
				System.out.println("the number that player " + plOne.getName() + " entered is greater than what the computer guessed");
			}
			System.out.println("player " + plTwo.getName() + " enter a number");
			plTwo.setNumber(sc.nextInt());
			System.out.println("player " + plTwo.getName() + " entered a number - " + plTwo.getNumber());
			if (plTwo.getNumber() == guessNumber) {
				System.out.println("player " + plTwo.getName() + " wins");
				break;
			}
			System.out.println("player " + plTwo.getName() + " entered wrong number");
			if (plTwo.getNumber() < guessNumber) {
				System.out.println("the number that player " + plTwo.getName() + " entered is less than what the computer guessed");
			} else {
				System.out.println("the number that player " + plTwo.getName() + " entered is greater than what the computer guessed");
			}
		} while (true);
	}
}