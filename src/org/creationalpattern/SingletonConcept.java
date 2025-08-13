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
}
