package org.exaample;

public class StringExample {

	public static void main(String[] args) {

		// Decalre literal String
		String s1 = "java";
		String s2 = "java";

		// To find memory address of the variable
		int identityHashCode = System.identityHashCode(s1);
		int identityHashCode2 = System.identityHashCode(s2);

		System.out.println(identityHashCode);
		System.out.println(identityHashCode2);

		String s3 = new String("java");
		String s4 = new String("java");
		// s3 and s4 --> Non literal String

		int identityHashCode3 = System.identityHashCode(s3);
		int identityHashCode4 = System.identityHashCode(s4);
		System.out.println(identityHashCode3);
		System.out.println(identityHashCode4);

		s1 = s1 + " programm";
		System.out.println(s1); // java programm
		int identityHashCode5 = System.identityHashCode(s1);
		System.out.println(identityHashCode5);

		StringBuffer buffer = new StringBuffer("Java");
		int identityHashCode6 = System.identityHashCode(buffer);
		System.out.println("Before changes :" + identityHashCode6);
		// Modifying the String buffer by using append()
		// append()--> Method is used to join two string
		buffer = buffer.append(" programm");
		System.out.println(buffer);

		// checking memory address

		int identityHashCode7 = System.identityHashCode(buffer);
		System.out.println("After changes :" + identityHashCode7);
	}
}
