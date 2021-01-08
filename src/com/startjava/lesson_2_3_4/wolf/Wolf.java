package com.startjava.lesson_2_3_4.wolf;

public class Wolf {

	private String gender = "male";
	private String nickname = "Barbos";
	private int weight;
	private int age;
	private String color;

	public String getGender() {
		return gender;
	}

	public String getNickname() {
		return nickname;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("incorrect age");
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void walk() {
		System.out.println("the wolf walks");
	}

	public void sit() {
		System.out.println("the wolf is sitting");
	}

	public void run() {
		System.out.println("the wolf runs");
	}

	public void howl() {
		System.out.println("the wolf howl");
	}

	public void hunt() {
		System.out.println("the wolf hunt");
	}
}