package test;
// import packagea.ClassA;


public class Test {




///////// #42
	 public void breakingDeclaration() {
		var silly 
		= 1;
	}
////////

<<<<<<< HEAD
=======


>>>>>>> dce1cf8 (#41..#44 Inferring the Type with var)
///////// #40 
	public void doesThisCompile(boolean check) {
		var question= 1;
		var answer = 0;
	
<<<<<<< HEAD
		if (check) {
			answer = 2;
		} else {
			answer = 3;
		}
		System.out.println(answer);
=======
	public void checkAnwser(boolean check) {
		//boolean value;	
		// does not compile value not initialize.
		//findAnswer(value);
		
		// does initialize
		boolean value = false; 
		findAnswer(value);
>>>>>>> dce1cf8 (#41..#44 Inferring the Type with var)
	}

////////

///////// #40 
	public void findAnswer(boolean check) {
		// not initialized
		int answer;
		int otherAnswer;  // not used therefore does not need to be initalized
		
		int onlyOneBranch;
		
		if (check) {
			onlyOneBranch = 1;
			answer = 1;
		} else {
			answer = 2;
		}
		
		// System.out.println(otherAnswer);
		System.out.println(answer);
	}
	
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
	
	Test test = new Test();
	test.breakingDeclaration();
<<<<<<< HEAD
	test.findAnswer(true);
=======
>>>>>>> dce1cf8 (#41..#44 Inferring the Type with var)
	
	System.out.println("Hell from Test #42");
	}
}
