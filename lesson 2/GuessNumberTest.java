import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the first player");
		Player playerOne = new Player(sc.next());
		System.out.println("the name of the first player - " + playerOne.getName());
		System.out.println("enter the name of the second player");
		Player playerTwo = new Player(sc.next());
		System.out.println("the name of the second player - " + playerTwo.getName());
		GuessNumber game = new GuessNumber(playerOne.getName(), playerTwo.getName());
		String confirmation;
		do {
			game.start();
			do {
				System.out.println("do you want to continue yes/no");
				confirmation = sc.next();
			} while (!confirmation.equals("yes") && !confirmation.equals("no"));
		} while (confirmation.equals("yes"));
		System.out.println("goodbay");
	}
}