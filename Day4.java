public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if (initialAge >= 0){
            this.age = initialAge;
        }
        else{
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        String outputString;
        if (this.age < 13){
            outputString = "You are young.";
        }
        else if(this.age >= 13 && this.age < 18){
            outputString = "You are a teenager.";
        }
        else{
            outputString = "You are old.";
        }
        System.out.println(outputString);
	}

	public void yearPasses() {
  		// Increment this person's age.
        this.age ++;
	}
}

