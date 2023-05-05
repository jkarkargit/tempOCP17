package test;
// import packagea.ClassA;


///////// #63 #01_23 Review Questions
public class River {
	
	int Depth = 1;
	
	// compile error
	// float temp = 50.0; 	// fails - does not compile 50.0 is double > float. 
	float temp = 50.0f;	// pass
	
	// default constructor
	public River() {}
	
	// method not consturctor
	public void flow() {
		for (int i = 0; i < 1; i++) {
			int depth = 2; // block variable - scope is in the for loop only
			depth++;  
			temp--;
			System.out.println(i + ": " + depth);
		}
		
		System.out.println(temp);
		
		// compile error
		// out of scope - is a block variable in the  for loop
		// System.out.println(depth); // out of scope - is a block variable in the  for loop
			
	}
	

	
///////// main()
	public static void main(String...s) {
		
		//////////////////////////////////////////////////////
		// javac -d classes -cp classes src/test/River.java
		// javac -d classes  src/test/River.java

		// java -cp classes test.River  
		// java -cp classes test/River
		//////////////////////////////////////////////////////


		
		
		// compile error
	    // new River.flow();
		
		River river = new River();
		river.flow();
		
		
	}
}
