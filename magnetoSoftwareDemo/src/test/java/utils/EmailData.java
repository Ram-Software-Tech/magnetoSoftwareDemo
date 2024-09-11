package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class EmailData {
	public static String randomestring(){
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
}
