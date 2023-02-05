
package Week2;

class Applicant {

	 private String name;
	 private String jobProfile;
	 private int age;

	 public String getName() {
	     return name;
	 }
	   
	 public void setName(String name) {
	     this.name = name;
	 }
	   
	 public String getJobProfile() {
	      return jobProfile;
	 }
	   
	 public void setJobProfile(String jobProfile) {
	     this.jobProfile = jobProfile;
	 }
	   
	 public int getAge() {
	     return age;
	 }
	   
	 public void setAge(int age) {
	     this.age = age;
	 }
	}
	class InvalidAgeException extends Exception{
		public InvalidAgeException(String message) {
		super(message);	
	}
	}
	class InvalidJobProfileException extends Exception{
		public InvalidJobProfileException(String message) {
			super(message);	
	}
	}
	class InvalidNameException extends Exception{
		public InvalidNameException(String message) {
			super(message);	
	}
	}



	class Validator{
		public boolean validateName(String name) {
			if(name==null || name.trim().isEmpty()) 
				return false;
			else 
				return true;
		}
		public boolean validateJobProfile(String jobProfile) {
			if(jobProfile.equalsIgnoreCase("Associate")||
					jobProfile.equalsIgnoreCase("Clerk")||
					jobProfile.equalsIgnoreCase("Excecutive")||
					jobProfile.equalsIgnoreCase("Officer"))
				return true;
				else
					return false;
			
		}
		public boolean validateAge(int age) {
			if(age>=18 && age<=30) 
				return true;
			else return false;
		}
		public void validate(Applicant applicant) throws InvalidAgeException,InvalidJobProfileException,InvalidNameException{
			if(!validateAge(applicant.getAge())) {
				System.out.print("Invalid Age");
			}
			else if (!validateJobProfile(applicant.getJobProfile())) {
				System.out.print("Invalid Job Profile");
			}
			else if(!validateName(applicant.getName())) {
				System.out.print("Invalid Name");
			}
		}
		
		
	}

	class BankException {

	 public static void main(String[] args) {
	         
	     try {
	         Applicant applicant= new Applicant();
	         applicant.setName("Jenny");
	         applicant.setJobProfile("Clerk");
	         applicant.setAge(25);
	         
	         Validator validator = new Validator();
	               
	         validator.validate(applicant);
	         System.out.println("Application submitted successfully!");
	     } 
	     catch (InvalidNameException|InvalidJobProfileException|InvalidAgeException e) {
	         System.out.println(((Throwable) e).getMessage());
	     }
	     try {
	         Applicant applicant= new Applicant();
	         applicant.setName(null);
	         applicant.setJobProfile("Clerk");
	         applicant.setAge(27);
	         
	         Validator validator = new Validator();
	               
	         validator.validate(applicant);
	     } 
	     catch (InvalidNameException|InvalidJobProfileException|InvalidAgeException e) {
	         System.out.println(((Throwable) e).getMessage());
	     }
	     try {
	         Applicant applicant= new Applicant();
	         applicant.setName("Jenny");
	         applicant.setJobProfile("Assistant");
	         applicant.setAge(25);
	         
	         Validator validator = new Validator();
	               
	         validator.validate(applicant);
	     } 
	     catch (InvalidNameException|InvalidJobProfileException|InvalidAgeException e) {
	         System.out.println(((Throwable) e).getMessage());
	     }
	 }
	}