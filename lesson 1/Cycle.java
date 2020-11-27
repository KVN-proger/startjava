public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i < 21; i++) {
			System.out.println("numbers from 0 to 20 - " + i);
		}

		int x = 8;
		while(x > - 6) {
			x -= 2;
			System.out.println("numbers from 6 to - 6 - " + x);
		}

		int y = 10;
		int result = 0;
		do {
			y++;
			if(y % 2 != 0) {
				result = result + y;
				if(result == 75) {
					System.out.println("sum of odd numbers from 10 to 20 - " + result);
				}
			}
		} while(y < 20);
	}
}