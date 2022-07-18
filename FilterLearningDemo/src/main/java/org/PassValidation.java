package org;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassValidation {
	public static boolean passCheck(String pass) {
		String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{5,15}$";
		Pattern pattern=Pattern.compile(regex);
		
		Matcher matcher=pattern.matcher(pass);
		return matcher.matches();
	}
}
