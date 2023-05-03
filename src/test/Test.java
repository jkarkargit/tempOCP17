package test;

// import packagea.ClassA;

public class Test {




///////// #46
// Tracing scope - exam tricks

	public void eatMore(boolean hungry, int amountOfFood) {
		int roomInBelly = 5;
		System.out.println("amountOfFood: " + amountOfFood);
		
		if (hungry) {
			System.out.println("amountOfFood: " + amountOfFood);
			var timeToEat = true;
			while (amountOfFood > 0) {
				int amountEaten = 2;
				roomInBelly = roomInBelly - amountEaten;
				amountOfFood = amountOfFood - amountEaten;
				System.out.println("amountOfFood: " + amountOfFood);
			}
		}
		System.out.println("amountOfFood: " + amountOfFood);
	}
/////////////




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
	test.eatMore(true, 10);
	
	
	// test.eat();
	// test.eat(100);
	//test.eatIfHungry(true);
	
	// tem.out.println();
	System.out.println("/////////////////////////////////////////////");
	System.out.println("Hell from Test #46");
	// System.out.println();
	// test. ;
	// System.out.println();
	System.out.println("/////////////////////////////////////////////");
	
	}
}
