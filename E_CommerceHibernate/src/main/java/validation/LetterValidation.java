package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterValidation {
	public static boolean letterCheck(String letter) {
		String regex="^[a-zA-Z]*$";
		Pattern pattern=Pattern.compile(regex);
		
		Matcher matcher=pattern.matcher(letter);
		return matcher.matches();
	}
}
