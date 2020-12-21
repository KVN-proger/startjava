public class Calculator {
	private int x;
	private int y;
	private char mathSign;
	public int result;

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setMathSign(char mathSign) {
		this.mathSign = mathSign;
	}

	public void count() {
		switch (mathSign) {
			case '+' :
				result = y + x;
				System.out.println("sum " + y + " + " + x + " = " + result);
				break;
			case '-' :
				result = y - x;
				System.out.println("subtraction " + y + " - " + x + " = " + result);
				break;
			case '*' :
				result = y * x;
				System.out.println("multiplication " + y + " - " + x + " = " + result);
				break;
			case '/' :
				result = y / x;
				System.out.println("div " + y + " - " + x + " = " + result);
				break;
			case '^' :
				result = 1;
				for (int a = 0; a < x; a++) {
					result *= y;
				}
				System.out.println("exponentiation " + x + " number " + y + " = " + result);
				break;
			case '%' :
				result = y % x;
				System.out.println("remainder of division " + y + " % " + x + " = " + result);
				break;
		}
	}
}