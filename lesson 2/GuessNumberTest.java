import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String confirmation;
		boolean isWin = false;
		int guessNumber;
		Scanner sc = new Scanner(System.in);
		GuessNumber gn = new GuessNumber();
		System.out.println("enter the name of the first player");
		Player playerOne = new Player(sc.next());
		System.out.println("the name of the first player - " + playerOne.representName());
		System.out.println("enter the name of the second player");
		Player playerTwo = new Player(sc.next());
		System.out.println("the name of the second player - " + playerTwo.representName());

		do {
			guessNumber = gn.generateRandomNumber();
			System.out.println("A random number is guessed - " + guessNumber);
			isWin = false;
			do {
				System.out.println("player " + playerOne.representName() + " enter a number");
				playerOne.setNumber(sc.nextInt());
				System.out.println("player " + playerOne.representName() + " entered a number - " + playerOne.getNumber());
				if (playerOne.getNumber() == guessNumber) {
					System.out.println("player " + playerOne.representName() + " wins");
					isWin = true;
					break;
				} else {
					System.out.println("player " + playerOne.representName() + " entered wrong number");
				}
				System.out.println("player " + playerTwo.representName() + " enter a number");
				playerTwo.setNumber(sc.nextInt());
				System.out.println("player " + playerTwo.representName() + " entered a number - " + playerTwo.getNumber());
				if (playerTwo.getNumber() == guessNumber) {
					System.out.println("player " + playerTwo.representName() + " wins");
					isWin = true;
					break;
				} else {
					System.out.println("player " + playerTwo.representName() + " entered wrong number");
				}
			} while (!isWin);
			do {
				System.out.println("do you want to continue yes/no");
				confirmation = sc.next();
			} while (!confirmation.equals("yes") && !confirmation.equals("no"));
		} while (confirmation.equals("yes"));
		System.out.println("goodbay");
	}
}