package smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf handy = new Smurf("Handy Smurf");
	System.out.println(handy.getName());
	handy.eat();
	handy.getHatColor();
	handy.isGirlOrBoy();
}
}
