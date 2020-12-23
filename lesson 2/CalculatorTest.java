import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String confirmation;
		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("enter the first number : 2");
			calc.setX(sc.nextInt());
			System.out.println("enter math Sign : ^");
			calc.setMathSign(sc.next().charAt(0));
			System.out.println("enter the second Number : 10");
			calc.setY(sc.nextInt());
			calc.calculate();

			do {
				System.out.println("do you want to continue calculating? yes/no");
				confirmation = sc.next();
			} while (!confirmation.equals("yes") && !confirmation.equals("no"));

		} while (confirmation.equals("yes"));
		System.out.println("goodbay");
	}
}