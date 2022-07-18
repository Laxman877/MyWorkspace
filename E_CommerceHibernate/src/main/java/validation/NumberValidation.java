package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidation {
	public static boolean numCheck(String num) {
		String regex="(0/91)?[6-9][0-9]{9}";
		Pattern pattern=Pattern.compile(regex);
		
		Matcher matcher=pattern.matcher(num);
		return matcher.matches();
	}
}
