package JunitTest.test;

public class Agevalidator {
	
		public String ageValid(int age) {
			if(age>=18) {
				return "valid age to vote";
			}
			else {
				return "check the age ";
			}

      }
}