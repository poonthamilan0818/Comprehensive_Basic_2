package org.automationanywhereTestNG;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class TestNgAssessment {

	@Test(enabled = true)
	private void checkGivenStringIsPalindrome() {
		System.out.println("Palindrome Test");
		String s = "madam";
		String out = "";
		for (int i = 0; i < s.length(); i++) {
			out = s.charAt(i) + out;
		}
		if (s.equals(out)) {
			System.out.println("Given string " + s + " is palindrome");
		} else {
			System.out.println("Given string " + s + " is not a palindrome");
		}
		System.out.println();
	}

	@Test(priority = 0)
	private void findEachCharacterOccuranceInAString() {
		System.out.println("Character Occurance Test");
		String str = "TestNGAssessment";
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}
		System.out.println("Given String is: " + str);
		System.out.println("Character occurance = " + m.toString());
		System.out.println();
	}

	@Test(priority = 1)
	private void sortTheArrayIntegers() {
		System.out.println("Array of integers sorting Test");
		int[] arr = { 9, 4, 43, 6, 32, 76, 54, 98, 23 };
		System.out.println("Given integer array is: " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Given sorted integer array is: " + Arrays.toString(arr));
		System.out.println();
	}

	@Test(timeOut = 10)
	private void fineTheCharacterCasesInAString() {
		System.out.println("Character cases Test");
		String s = "qwert1231#@#@JHHJFD&^dfc";
		System.out.println("Given string is: " + s);
		char[] ch = s.toCharArray();
		String spCase = "", upCase = "", loCase = "", nums = "";
		for (char c : ch) {
			if (Character.isDigit(c)) {
				nums = nums + c;
			} else if (Character.isLowerCase(c)) {
				loCase = loCase + c;
			} else if (Character.isUpperCase(c)) {
				upCase = upCase + c;
			} else {
				spCase = spCase + c;
			}
		}
		System.out.println("Uppercase Character: " + upCase);
		System.out.println("Lower Character: " + loCase);
		System.out.println("Number Character: " + nums);
		System.out.println("Special Character: " + spCase);
	}

}
