package com.strings;

// Interface
interface Animal1 {
	public void animalSound(); // interface method (does not have a body)

	public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig1 implements Animal1 {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}

	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Zzz");
	}
}

class InterfaceTest {
	public static void main(String[] args) {
		Pig1 myPig = new Pig1(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
		
		// Animal myPig = new Pig();  // throws exception as interface has no constructor , reference type has to be a class.
	    // but abstract class allows it to have reference type as Animal class name and points to sub class object pig.
	    
	}
}