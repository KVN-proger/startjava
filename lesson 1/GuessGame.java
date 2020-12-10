public class GuessGame {
	public static void main(String[] args) {
		int targetNumber = 58;
		int guessNumber = 0;

		int[] randomNumber = {33, 2, 60, 45, 89, 15, 77, 25, 58, 95, 17, 65, 51, 10};

		for (int i = 0; i < randomNumber.length; i++) {
			guessNumber = randomNumber[i];
			System.out.println("The player thinks it's a number - " + guessNumber);

			if (guessNumber == targetNumber) {
				System.out.println("You to guess!");
				break;
			}

			if (guessNumber < targetNumber) {
				System.out.println("the number you entered is less than what the computer guessed");
			} else {
				System.out.println("the number you entered is greater than what the computer guessed");
			}

			System.out.println("You need to try again");
		}
	}
}