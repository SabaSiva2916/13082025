package org.exaample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class ListExample {

	public static void main(String[] args) {
		// Collection without generic
		List li = new ArrayList();
		// To add value into list --> we have method called add();

		li.add(10); // int type
		li.add(10.354); // float type
		li.add("java"); // String type
		li.add('n'); // char type
		li.add(true); // boolean type

		System.out.println(li);

		// Collection with generic
		List<String> l = new ArrayList<String>();
		// l --> we can add only String type, we cant able to add any other type value
		// adding value to list
		l.add("Java");
		l.add("Selenium");
		l.add("Python");

		System.out.println(l);

		Set<Integer> si = new LinkedHashSet<Integer>();
		si.add(10);
		si.add(20);
		si.add(30);
		si.add(10);
		si.add(30);
		si.add(60);

		System.out.println(si);

		for (Integer integer : si) {
			System.out.println(integer);
		}

		Map<String, String> map = new HashMap<String, String>();
		// To add value into map --> put()

		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");
		map.put("d", "4");
		map.put("e", "5");

		System.out.println(map);

		// To iterate Map --> We need to use entrySet(), then only we can perform
		// iteration in map
		Set<Entry<String, String>> entrySet = map.entrySet();

		for (Entry<String, String> entry : entrySet) {
			// To get key alone
			String key = entry.getKey();
			// To get value alone
			String value = entry.getValue();

			System.out.println(key + "___" + value);
		}
	}

}
