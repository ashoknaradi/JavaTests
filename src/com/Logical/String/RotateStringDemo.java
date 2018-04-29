package com.Logical.String;

public class RotateStringDemo {
	public static void main(String args[]) {
		String test = "abcd";
		String rotated = "bcda";
		boolean isRotated = isRotatedVersion(test, rotated);
		System.out.printf("Is '%s' is rotation of '%s' : %b %n", rotated, test, isRotated);
	}

	public static boolean isRotatedVersion(String str, String rotated) {
		boolean isRotated = false;
		if (str == null || rotated == null) {
			return false;
		} else if (str.length() != rotated.length()) {
			isRotated = false;
		} else {
			String concatenated = str + str;
			for (int i = 0; i < concatenated.length(); i++) {
				if (rotated.charAt(0) == concatenated.charAt(i)) {
					System.out.println("Rotated String Index Position is : " + i);
					break;
				}
			}
			isRotated = concatenated.contains(rotated);
		}
		return isRotated;
	}
}