package _026Blocks ;

public class Chick {
	private String name = "Fluffy";
	
	// Instance Initializer block
	{ System.out.println("1: setting field"); }
	
	// constructor
	public Chick() {
		name = "Tiny";
		System.out.println("2: setting constructor");
	}

	// main() method
	public static void main(String[] args) {
		Chick chick = new Chick();
		System.out.println("3: " + chick.name); } 
}