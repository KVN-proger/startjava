import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	int guessNumber;
	Scanner sc = new Scanner(System.in);
	private Player plOne;
	private Player plTwo;
	Random randomNumber = new Random();

	public GuessNumber (Player plOne, Player plTwo) {
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
			System.out.println("player " + plTwo.getName() + " enter a number");
			plTwo.setNumber(sc.nextInt());
			System.out.println("player " + plTwo.getName() + " entered a number - " + plTwo.getNumber());
			if (plTwo.getNumber() == guessNumber) {
				System.out.println("player " + plTwo.getName() + " wins");
				break;
			}
			System.out.println("player " + plTwo.getName() + " entered wrong number");
		} while (true);
	}
}