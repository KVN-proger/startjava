package com.startjava.lesson_2_3.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();
		jaegerOne.setModelName("Striker Eureka");
		jaegerOne.setMark("Mark-5");
		jaegerOne.setStatus("Destroyed");
		jaegerOne.setOrigin("Australia");
		jaegerOne.setHeight(76.2);
		jaegerOne.setWeight(1.850);
		jaegerOne.setSpeed(10);
		jaegerOne.setStrength(10);
		jaegerOne.setArmor(9);
		jaegerOne.setIsDrift(true);
		jaegerOne.setSteps(2);
		jaegerOne.setScan(true);
		System.out.println("Model name - " + jaegerOne.getModelName());
		System.out.println("Mark - " + jaegerOne.getMark());
		System.out.println("Status - " + jaegerOne.getStatus());
		System.out.println("Origin - " + jaegerOne.getOrigin());
		System.out.println("Height - " + jaegerOne.getHeight());
		System.out.println("Weight - " + jaegerOne.getWeight());
		System.out.println("Speed - " + jaegerOne.getSpeed());
		System.out.println("Strength - " + jaegerOne.getStrength());
		System.out.println("Armor - " + jaegerOne.getArmor());
		jaegerOne.drift();
		jaegerOne.move();
		System.out.println("Scanning Kaiju - " + jaegerOne.scanKaiju());

		Jaeger jaegerTwo = new Jaeger();
		jaegerTwo.setModelName("Crimson Typhoon");
		jaegerTwo.setMark("Mark-4");
		jaegerTwo.setStatus("Destroyed");
		jaegerTwo.setOrigin("China");
		jaegerTwo.setHeight(76.2);
		jaegerTwo.setWeight(1.722);
		jaegerTwo.setSpeed(9);
		jaegerTwo.setStrength(8);
		jaegerTwo.setArmor(6);
		jaegerTwo.setIsDrift(false);
		jaegerTwo.setSteps(1);
		jaegerTwo.setScan(false);
		System.out.println("Model name - " + jaegerTwo.getModelName());
		System.out.println("Mark - " + jaegerTwo.getMark());
		System.out.println("Status - " + jaegerTwo.getStatus());
		System.out.println("Origin - " + jaegerTwo.getOrigin());
		System.out.println("Height - " + jaegerTwo.getHeight());
		System.out.println("Weight - " + jaegerTwo.getWeight());
		System.out.println("Speed - " + jaegerTwo.getSpeed());
		System.out.println("Strength - " + jaegerTwo.getStrength());
		System.out.println("Armor - " + jaegerTwo.getArmor());
		jaegerTwo.drift();
		jaegerTwo.move();
		System.out.println("Scanning Kaiju - " + jaegerTwo.scanKaiju());
	}
}