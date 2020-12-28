import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private String namePlayerOne;
	private String namePlayerTwo;
	private int scPlayerOne;
	private int scPlayerTwo;
	boolean isWin = false;
	int guessNumber;
	Scanner sc = new Scanner(System.in);
	Player plOne = new Player(scPlayerOne);
	Player plTwo = new Player(scPlayerTwo);
	Random randomNumber = new Random();

	public void setNamePlayerOne(String namePlayerOne) {
		this.namePlayerOne = namePlayerOne;
	}

	public void setNamePlayerTwo(String namePlayerTwo) {
		this.namePlayerTwo = namePlayerTwo;
	}

	public void playGame() {
		guessNumber = randomNumber.nextInt(100);
		System.out.println("A random number is guessed - " + guessNumber);

		do {
			System.out.println("player " + namePlayerOne + " enter a number");
			plOne.setNumber(sc.nextInt());
			System.out.println("player " + namePlayerOne + " entered a number - " + plOne.getNumber());
			if (plOne.getNumber() == guessNumber) {
				System.out.println("player " + namePlayerOne + " wins");
				isWin = true;
				break;
			} else {
				System.out.println("player " + namePlayerOne + " entered wrong number");
			}
			System.out.println("player " + namePlayerTwo + " enter a number");
			plTwo.setNumber(sc.nextInt());
			System.out.println("player " + namePlayerTwo + " entered a number - " + plTwo.getNumber());
			if (plTwo.getNumber() == guessNumber) {
				System.out.println("player " + namePlayerTwo + " wins");
				isWin = true;
				break;
			} else {
				System.out.println("player " + namePlayerTwo + " entered wrong number");
			}
		} while (!isWin);
	}
}