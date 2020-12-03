public class Calculator {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		int result = 0;
		char mathSign;

		char [] mathSigns = {'+', '-', '*', '/', '^', '%'};

		for (int i = 0; i < 6; i++) {
			mathSign = mathSigns[i];

			if (mathSign == '+') {
				result = x + y;
				System.out.println("sum " + x + " + " + y + " = " + result);
			} else {
				System.out.println("the sign of the mathematical operation not the sum is selected");
			}

			if (mathSign == '-') {
				result = x - y;
				System.out.println("subtraction " + x + " - " + y + " = " + result);
			} else {
				System.out.println("the sign of the mathematical operation not the subtraction is selected");
			}

			if (mathSign == '*') {
				result = x * y;
				System.out.println("multiplication " + x + " * " + y + " = " + result);
			} else {
				System.out.println("the sign of the mathematical operation not the multiplication is selected");
			}

			if (mathSign == '/') {
				result = x / y;
				System.out.println("div " + x + " / " + y + " = " + result);
			} else {
				System.out.println("the sign of the mathematical operation not the div is selected");
			}

			if (mathSign == '^') {
				result = x * x;
				System.out.println("exponentiation 2 number " + x + " = " + result);
				result = y * y;
				System.out.println("exponentiation 2 number " + y + " = " + result);
			} else {
				System.out.println("the exponentiation operation is not selected");
			}

			if (mathSign == '%') {
				result = x % y;
				System.out.println("remainder of division " + x + " % " + y + " = " + result);
			} else {
				System.out.println("the operation for finding the remainder of a division is not selected");
			}
		}
	}
}