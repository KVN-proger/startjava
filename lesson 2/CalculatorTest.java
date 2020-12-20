import java.util.Scanner;
public class CalculatorTest {
	public static void main(String[] args) {
		String confirmation1 = "yes";
		String confirmation2 = "no";
		Calculator calculatorOne = new Calculator();
		Scanner sc = new Scanner(System.in);
		String confirmation;

		do {
			System.out.println("enter the first number : 2");
			int firstNumber = sc.nextInt();
			calculatorOne.setX(firstNumber);
			System.out.println("enter math Sign : ^");
			char sign = sc.next().charAt(0);
			calculatorOne.setMathSign(sign);
			System.out.println("enter the second Number : 10");
			int secondNumber = sc.nextInt();
			calculatorOne.setY(secondNumber);
			calculatorOne.calculation();

			do {
				System.out.println("do you want to continue calculating? yes/no");
				confirmation = sc.next();
					if (confirmation.equals(confirmation2)){
						System.out.println("goodbay");
					}
			} while (!confirmation.equals(confirmation1) & !confirmation.equals(confirmation2));

		} while (confirmation.equals(confirmation1));
	}
}