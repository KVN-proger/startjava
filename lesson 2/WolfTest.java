public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.gender = "male";
		wolfOne.nickname = "Barbos";
		wolfOne.weight = 25;
		wolfOne.age = 10;
		wolfOne.color = "gray";
		System.out.println("gender of the wolf - " + wolfOne.gender);
		System.out.println("nickname of the wolf - " + wolfOne.nickname);
		System.out.println("weight of the wolf - " + wolfOne.weight);
		System.out.println("age of the wolf - " + wolfOne.age);
		System.out.println("color of the wolf - " + wolfOne.color);
		wolfOne.walk();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}