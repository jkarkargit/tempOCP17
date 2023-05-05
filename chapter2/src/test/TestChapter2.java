package test;
// import packagea.ClassA;


public class TestChapter2 {


///////// #80..#82 compuound assignment [+=, -+=, *=, /=]
	 public void compoundAssignment() {
		//// explicitly cast
		long goat  = 10;
		int  sheep = 5;
		
		Object ogoat  = goat;
		Object osheep = sheep;
		

		System.out.println(((Object)osheep.getClass().getSimpleName() ));
		
		///// Rule #1: (sheep + goat) sheep is promoted to long, the larger type (of goat)
		///// (sheep =) explicit casting is required (since sheep is int)
		///// and long cannot be assigned to int
		// sheep = sheep * goat; // DOES NOT COMPILE
		
		// solution one: explicit cast
		sheep = (int) (sheep * goat);
		Object osheep2 = sheep;
		System.out.println(((Object)osheep2.getClass().getSimpleName() ));
			
		System.out.println();
		
		// solution two: use compound assignment +=
		sheep *= goat;
		Object osheep3 = sheep;
		System.out.println(((Object)osheep3.getClass().getSimpleName() ));
	}
////////

	
///////// main()
	public static void main(String[] args) {
		
		TestChapter2 testChapter2 = new TestChapter2();
		testChapter2.compoundAssignment();
		
		System.out.println();
		
		System.out.println("////////////////////////////////////////////////////////////////////////");
		System.out.println("Hello from TestChapter2 #80..#82 compuound assignment [+=, -+=, *=, /=]");
		System.out.println("////////////////////////////////////////////////////////////////////////");
	}
}
