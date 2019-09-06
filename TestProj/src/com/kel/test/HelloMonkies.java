package com.kel.test;

public class HelloMonkies{
	
	public static String powerLevel(String name)
	{
		return name + "'s power level is over 9000!?!";
	}
	public static void main(String[] args) {
	
		System.out.println("Hello Monkies");
		
		String person = "Thanos";
		
		System.out.println("What's " + person + "'s power level?");
		
		System.out.println(powerLevel(person));
		
	
	}



}
