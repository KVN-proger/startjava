public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 25;
		int genderMale = 1;
		float height = 1.7f;
		boolean isGenderMale = genderMale ==1;
		char firstLetterName = 'M';

		if(age>20){
			System.out.println("Mark is over 20 years old");
		}

		if(isGenderMale){
			System.out.println("Mark is man");
		}

		if(!isGenderMale){
			System.out.println("This person is woman");
		};

		if(height<1.80f){
			System.out.println("Mark is short");
		}else{
			System.out.println("Mark is tall");
		}

		if(firstLetterName == 'M'){
			System.out.println("in the name Mark the first letter - M ");
		}else if(firstLetterName == 'I'){
			System.out.println("in the name the first letter - I");
		}else{
			System.out.println("in the name the first letter is not I");
		}

	}
}