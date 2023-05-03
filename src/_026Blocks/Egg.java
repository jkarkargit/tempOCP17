package _026Blocks ;

public class Egg {
	private String name = "Fluffy";
	
	// constructor
	public Egg() {
		number = 5;
	}

	// main() method
	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println(egg.number); 
	} 
		
	// field
	private int number = 3;

	// Instance Initializer block
	{ number = 4; }
}