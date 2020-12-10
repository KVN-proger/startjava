public class Unicode {
	public static void main(String[] args) {
		char unicodeSign;

		for (char i = '\u0021'; i < '\u007F'; i++) {
			unicodeSign = i;
			System.out.println(unicodeSign);
		}
	}
}