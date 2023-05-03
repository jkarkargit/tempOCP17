package test;
// import packagea.ClassA;


public class Test {




///////// #40 
	public void findAnwser(boolean check) {}
	
	public void checkAnwser(boolean check) {
		//boolean value;	
		// does not compile value not initialize.
		//findAnswer(value);
		
		// does initialize
		boolean value = false;
		findAnswer(value);
	}

/////////   








	
///////// #39 
///////// local variables (called method variables)
///////// do not have default values.
	public void findAnswer(boolean check) {
		// not initialized
		int answer;
		int otherAnswer;
		int onlyOneBranch;
		
		if (check) {
			onlyOneBranch = 1;
			answer = 1;
		} else {
			answer = 2;
		}
		
		System.out.println(answer);
		
		// does not compile onlyOneBranch must be initialized first
		// System.out.println(onlyOneBranch);
	}

	public int notValid() {
		int y =10;
		int x;
		x = 3;
		int reply = x + y; // DOES NOT COMPILE IF x IS NOT INITIALISED:	x=3
		return reply;
	}

	public int valid() {
		int y =10;
		int x;
		x = 3;
	    int z;  // NEVER USED - COMPILES
		int reply = x + y;  
		return reply;
	}
/////////////
	
	
///////// main()
	public static void main(String[] args) {
	// ClassA a;
	System.out.println("Hell from Test");
	}
}
