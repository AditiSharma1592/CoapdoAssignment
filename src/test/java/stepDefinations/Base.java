package stepDefinations;

import org.apache.commons.lang.RandomStringUtils;

public class Base {

	//Random string for unique email address
	public static String RandomEmail() {
		String randomstring= RandomStringUtils.randomAlphabetic(7);
		return (randomstring);
}
}