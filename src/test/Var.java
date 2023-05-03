package test;
// import packagea.ClassA;


public class Var {



///////// #44

    // method
	public void var() {
		var var = "var";
		System.out.println("Var.var() method...");
	}


	// constructor no type
	public Var() {
	}



	// not a constructor, this is a method
	// Any method declared void doesn't return a value.
	// It does not need to contain a return statement, but it may do so.
	public void Var() {
		System.out.println("Var constructor...");
		Var var = new Var();
		var.var();
		
		return;  // void => return; can be omited
	}

////////

	
///////// main()
	public static void main(String[] args) {
		Var var = new Var();
		
		System.out.println("Hello from Var #44");
	}
}
