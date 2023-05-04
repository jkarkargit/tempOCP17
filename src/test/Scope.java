package test;
// import packagea.ClassA;


public class Scope {



///////// #50
///////// ref and gc
	
///////// main()
	public static void main(String[] args) {
		
		String one, two;
		
		one = new String("a");
		two = new String("b");
		
		System.out.println("String one : " + one);
		System.out.println("String two : " + two);
		
		one = two;
		
		System.out.println("one = two::String one : " + one);
		
		
		System.out.println("\nHello from Scope #50");
	}
}
