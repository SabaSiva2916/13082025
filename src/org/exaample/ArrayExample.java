package org.exaample;

public class ArrayExample {

	public static void main(String[] args) {

		int[] arr = new int[5];
		// assigin value to arr based on index
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 2;
		arr[3] = 4;
		arr[4] = 5;

		System.out.println(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println();

		for (int i : arr) {
			System.out.println(i);
		}

		String s[] = new String[3];
		s[0] = "a";
		s[1] = "b";
		s[2] ="c";
		s[3] = "d";
		
		for (String string : s) {
		System.out.println(string);	
		}
				

	}
}
