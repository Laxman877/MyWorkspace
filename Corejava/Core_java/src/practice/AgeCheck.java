package practice;

public class AgeCheck {
	
	static void validate(int age) throws AgeInvalidException{
		if(age<18) {
			
			throw new AgeInvalidException("age is not valid to vote");
			
		}else {
			System.out.println("age is valid to vote");
		}
	}

}
