public class Calculator {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		if (x + y == 15) {
			System.out.println("sum " + x + " + " + y + " = 15");
		} else {
			System.out.println("the sign of the mathematical operation not the sum is selected");
		}

		if (x - y == 5) {
			System.out.println("subtraction " + x + " - " + y + " = 5");
		} else {
			System.out.println("the sign of the mathematical operation not the subtraction is selected");
		}

		if (x * y == 50) {
			System.out.println("multiplication " + x + " * " + y + " = 50");
		} else {
			System.out.println("the sign of the mathematical operation not the multiplication is selected");
		}

		if (x / y == 2) {
			System.out.println("div " + x + " / " + y + " = 2");
		} else {
			System.out.println("the sign of the mathematical operation not the div is selected");
		}

		if (x * x == 100) {
			System.out.println("exponentiation 2 number " + x + " = 100");
		} else {
			System.out.println("the exponentiation operation is not selected");
		}

		if (x % y == 0) {
			System.out.println("remainder of division " + x + " % " + y + " = 0");
		} else {
			System.out.println("the operation for finding the remainder of a division is not selected");
		}
	}
}