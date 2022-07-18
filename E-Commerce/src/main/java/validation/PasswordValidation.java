package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
	public static boolean passCheck(String pass) {
		String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,16}$";
		Pattern pattern=Pattern.compile(regex);

		Matcher matcher=pattern.matcher(pass);
		return matcher.matches();
	}
}
