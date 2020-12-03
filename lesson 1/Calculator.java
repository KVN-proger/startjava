public class Calculator {
	public static void main(String[] args) {

		int x = 10;
		int y = 5;
		int z = 0;
		char symbol;

		char [] symbolArray = { '+', '-', '*', '/', '^' , '%'};

		for (int i = 0; i < 6 ; i++) {
			symbol = symbolArray[i];

			if (symbol == '+') {
				z = x + y;
				System.out.println("sum " + x + " + " + y + " = " + z);
			} else {
				System.out.println("the sign of the mathematical operation not the sum is selected");
			}

			if (symbol == '-') {
				z = x - y;
				System.out.println("subtraction " + x + " - " + y + " = " + z);
			} else {
				System.out.println("the sign of the mathematical operation not the subtraction is selected");
			}

			if (symbol == '*') {
				z = x * y;
				System.out.println("multiplication " + x + " * " + y + " = " + z);
			} else {
				System.out.println("the sign of the mathematical operation not the multiplication is selected");
			}

			if (symbol == '/') {
				z = x / y;
				System.out.println("div " + x + " / " + y + " = " + z);
			} else {
				System.out.println("the sign of the mathematical operation not the div is selected");
			}

			if (symbol == '^') {
				z = x * x;
				System.out.println("exponentiation 2 number " + x + " = " + z);
			} else {
				System.out.println("the exponentiation operation is not selected");
			}

			if (symbol == '%') {
				z = x % y;
				System.out.println("remainder of division " + x + " % " + y + " = " + z);
			} else {
				System.out.println("the operation for finding the remainder of a division is not selected");
			}
		}
	}
}