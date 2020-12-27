import java.util.Random;

public class GuessNumber {
	Random randomNumber = new Random();

	public int generateRandomNumber() {
		return randomNumber.nextInt(100);
	}
}