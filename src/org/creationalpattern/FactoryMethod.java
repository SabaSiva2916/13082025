package org.creationalpattern;

interface Animal {
	void speak();

}

class Dog implements Animal {
	public void speak() {
		System.out.println("Dog Braks!!!");
	}
}

class Cat implements Animal {

	public void speak() {
		System.out.println("Cat Memow !!!");
	}

}

public class FactoryMethod {

	public static Animal getAnimal(String type) {
		if (type.equals("dog"))
			return new Dog();
		else if (type.equals("cat"))
			return new Cat();
		return null;

	}

	public static void main(String[] args) {
		Animal animal = getAnimal("cat");
		animal.speak();

		Animal animal2 = getAnimal("dog");
		animal2.speak();

		System.out.println(System.identityHashCode(animal));
		System.out.println(System.identityHashCode(animal2));
	}
}
