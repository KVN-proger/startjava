import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	boolean isWin = false;
	int guessNumber;
	private String namePlOne;
	private String namePlTwo;
	Scanner sc = new Scanner(System.in);
	Player plOne = new Player();
	Player plTwo = new Player();
	Random randomNumber = new Random();
	public GuessNumber (String namePlOne, String namePlTwo) {
		this.namePlOne = namePlOne;
		this.namePlTwo = namePlTwo;

	}
	public void start() {
		guessNumber = randomNumber.nextInt(100);
		System.out.println("A random number is guessed - " + guessNumber);

		do {
			System.out.println("player " + namePlOne + " enter a number");
			plOne.setNumber(sc.nextInt());
			System.out.println("player " + namePlOne + " entered a number - " + plOne.getNumber());
			if (plOne.getNumber() == guessNumber) {
				System.out.println("player " + namePlOne + " wins");
				isWin = true;
				break;
			}
			System.out.println("player " + namePlOne + " entered wrong number");
			System.out.println("player " + namePlTwo + " enter a number");
			plTwo.setNumber(sc.nextInt());
			System.out.println("player " + namePlTwo + " entered a number - " + plTwo.getNumber());
			if (plTwo.getNumber() == guessNumber) {
				System.out.println("player " + namePlTwo + " wins");
				isWin = true;
				break;
			}
			System.out.println("player " + namePlTwo + " entered wrong number");
		} while (true);
	}
}