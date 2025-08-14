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

	public void test() {
		System.out.println("Sample Test class for execution");

	}
}
