package org.exaample;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Example {

	public static void main(String[] args) {

		// Create Object for Vector class
		Vector<String> v = new Vector<String>();
		// By using add() we add values into Vector
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");

		System.out.println(v); // [A,B,C,D,E]
		// To get Value as one by one format ---> We need to go for iteration
		// For doing iteration we dont want to use for & for-each.
		// We use Enumeration since vector is legacy class
		Enumeration<String> elements = v.elements();
		while (elements.hasMoreElements()) {
			String string = elements.nextElement();
			System.out.println(string);

		}

		// Perform iterator
		Iterator<String> iterator = v.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			if (string.equals("B")) {
				iterator.remove();
			}
		}

		System.out.println(v);
	}

}
