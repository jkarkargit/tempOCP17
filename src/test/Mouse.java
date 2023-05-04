package test;

// import packagea.ClassA;

public class Mouse {

///////// #47
// Applying scop to classes

	// class variable
	final static int MAX_LENGHT = 5;
	
	// instance variable
	int length;

	public void grow(int inches) {
		System.out.println("mouse.grow() called");
		System.out.println("/////////////////////////////////////////////");
		
		if(length < MAX_LENGHT) {
			
			// newSize scopt is within th if block 
			int newSize = length + inches;
			length = newSize;
		}
		System.out.println("lenght: " + length);
	}
/////////////




	
	
///////// main()
	public static void main(String[] args) {
	System.out.println("////////////////////// Mouse //////////////////");
	System.out.println("Mouse #47 - main()") ;
	System.out.println("/////////////////////////////////////////////");
	System.out.println();
	// System.out.println();
	System.out.println("///////// #47 // Applying Scope to Classes");
	
	Mouse mouse = new Mouse();
	mouse.grow(10);
	
	
	// test.eat();
	// test.eat(100);
	//test.eatIfHungry(true);
	
	// tem.out.println();
	// System.out.println();
	// test. ;
	// System.out.println();
	System.out.println("/////////////////////////////////////////////");
	
	}
}
