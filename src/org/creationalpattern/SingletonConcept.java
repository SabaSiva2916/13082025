package org.creationalpattern;

public class SingletonConcept {

	private static SingletonConcept singeton;

	private SingletonConcept() {

	}

	public static SingletonConcept getInstance() {
		if (singeton == null) {
			singeton = new SingletonConcept();
		}

		return singeton;

	}
	
	public void reverseOfString() {
		String str = "Java Program";
		String output = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			output = output+str.charAt(i);
		}
		System.out.println("Reverse of String :"+ output);
	}
}
