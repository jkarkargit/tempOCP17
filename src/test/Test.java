package test;

// import packagea.ClassA;

public class Test {




///////// #45


	// there are two variable with local scope.
	// pieceOfCheese is a mehtod parameter
	// bitesOCheese is decalred inside the method
	// neither variable can be used outsie where it defined
	public void eat (int piecesOfCheese) {
		int bitesOfCheese = 1;
		System.out.println(piecesOfCheese);
	}

	public void eat() {
		int bitesOfCheese = 1;
		
		System.out.println("eat(): " + bitesOfCheese);
		// System.out.println();
	}
	
	
	public void eatIfHungry(boolean hungry) {
		
		if (hungry) {
			int bitesOfCheese = 1;
			
			System.out.println("eatIfHungry(): " + bitesOfCheese); 
		}
		
		// bitesOCheese out of scope here
		// DOES NOT COMPILE
		// System.out.println(bitesOfCheese); 
			
	}
		
////////


	
	
///////// main()
	public static void main(String[] args) {
	System.out.println();
	System.out.println("////////////////////// Test //////////////////");
	
	Test test = new Test();
	test.eat();
	test.eat(100);
	test.eatIfHungry(true);
	
	// tem.out.println();
	System.out.println("/////////////////////////////////////////////");
	System.out.println("Hell from Test #42");
	// System.out.println();
	// test. ;
	// System.out.println();
	System.out.println("/////////////////////////////////////////////");
	
	}
}
