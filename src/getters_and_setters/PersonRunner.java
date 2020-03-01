package getters_and_setters;

public class PersonRunner {
public static void main(String[] args) {
	Person jeff = new Person();
	Person bob = new Person();
	Person timbo = new Person();
	jeff.setName("Jeff");
	bob.setName("Bob");
	timbo.setName("Timbo");
	jeff.setSuperpower("cheese-eating");
	bob.setSuperpower("typing");
	timbo.setSuperpower("telling the truth all the time");
	System.out.println(jeff);
	System.out.println(bob);
	System.out.println(timbo);
}
}
