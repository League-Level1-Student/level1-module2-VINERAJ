package smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf handy = new Smurf("Handy Smurf");
	System.out.println(handy.getName());
	handy.eat();
	System.out.println(handy.getHatColor());
	System.out.println(	handy.isGirlOrBoy());
	Smurf papaSmurf = new Smurf("Papa Smurf");
	System.out.println(papaSmurf.getName());
	System.out.println(papaSmurf.getHatColor());
	System.out.println(papaSmurf.isGirlOrBoy());
	Smurf smurfette = new Smurf("Smurfette");
	System.out.println(smurfette.getName());
	System.out.println(smurfette.getHatColor());
	System.out.println(smurfette.isGirlOrBoy());
}
}
