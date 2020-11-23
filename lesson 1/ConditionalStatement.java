public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 25;

		if(age > 20) {
			System.out.println("Mark is over 20 years old");
		}

		boolean isGenderMale = true;

		if(isGenderMale) {
			System.out.println("Mark is man");
		}

		if(!isGenderMale) {
			System.out.println("This person is woman");
		};

		float height = 1.7f;

		if(height < 1.80f) {
			System.out.println("Mark is short");
		} else {
			System.out.println("Mark is tall");
		}

		char firstLetterName = 'M';

		if(firstLetterName == 'M') {
			System.out.println("in the name Mark the first letter - M ");
		} else if(firstLetterName == 'I') {
			System.out.println("in the name the first letter - I");
		} else {
			System.out.println("in the name the first letter is not I");
		}

	}
}