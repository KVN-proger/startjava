package com.startjava.lesson_2_3_4.wolf;

public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setWeight(25);
		wolfOne.setAge(5);
		wolfOne.setColor("gray");
		System.out.println("gender of the wolf - " + wolfOne.getGender());
		System.out.println("nickname of the wolf - " + wolfOne.getNickname());
		System.out.println("weight of the wolf - " + wolfOne.getWeight());
		System.out.println("age of the wolf - " + wolfOne.getAge());
		System.out.println("color of the wolf - " + wolfOne.getColor());
		wolfOne.walk();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}