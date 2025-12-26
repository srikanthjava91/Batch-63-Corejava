package com.stringhandling;

public class IdValidator {

	// Regex patterns (Java strings need double backslashes)
	// AMIAS
	private static final String PAN_REGEX = "^[A-Z]{5}[0-9]{4}[A-Z]$";
	private static final String AADHAAR_REGEX = "^\\d{12}$";
	private static final String AADHAAR_WITH_SPACES = "^(?:\\d{12}|\\d{4}\\s\\d{4}\\s\\d{4})$";
	private static final String MOBILE_REGEX = "^[0-9]{10}$";

	public static boolean isMobileNumberValid(String mobile) {

		if (mobile == null) {
			return false;
		} else {
			return mobile.matches(MOBILE_REGEX);
		}
	}

	public static boolean isValidPAN(String pan) {
		if (pan == null)
			return false;
		pan = pan.trim().toUpperCase(); // normalize
		return pan.matches(PAN_REGEX);
	}

	public static boolean isValidAadhaar(String aadhaar) {
		if (aadhaar == null)
			return false;
		aadhaar = aadhaar.trim();
		// accept digits-only OR grouped with spaces
		return aadhaar.matches(AADHAAR_WITH_SPACES);
	}

	// Example usage
	public static void main(String[] args) {
		System.out.println(isValidPAN("AMIPC3751H")); // true
		System.out.println(isValidPAN("   abcde1234f   ")); // true because we uppercase it
		System.out.println(isValidAadhaar("123412341234")); // true
		System.out.println(isValidAadhaar("1234 1234 1234")); // true
		System.out.println(isValidAadhaar("1234-1234-1234")); // false (hyphens not allowed)
		System.out.println(isMobileNumberValid("9972677655"));
	}
}
