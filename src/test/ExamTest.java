package test;
// import packagea.ClassA;


public class ExamTest {

	// object references default to null
	// examplel String s;  s == n
	// primitive do not default to null.
	char c; //default to '\000'
	
	// int gills = 0, double weight =2 ; // generate a compiler error
	

///////// #C01_08
	public void C01_08() {
		System.out.println("public void 01_08()");
		
		// javac: does compile this is a valid numeric expression
		// BUT 
		// java: causes a runtime exception: java.lang.ArithmeticException: / by zero
		var day = 1/0; 
		
	}

///////// #C01_09
	public void C01_09() {
		System.out.println("public void 01_09()");
		System.out.println("defalut for instance char c: " + this.c);
	}

///////// #C01_10
	public void C01_10() { 
	
		var magic = 3_1 ; 		// pass
		// var magic = _329_.0 ;  	// fail
		// var magic = 3_13.0_ ; 	// fail
		// var magic = 5_2912._2 ;  // fail
		// var magic =  2_234.0_0 ;	// pass
		// var magic =  9___6 ;		// pass
		// var magic =  _1_3_5_0;	// fail
		System.out.println(magic);
	}
		
///////// #C01_12
	 void C01_12(int length) { 
	
		var magic = 3_1 ; 		// pass
		// var magic = _329_.0 ;  	// fail
		// var magic = 3_13.0_ ; 	// fail
		// var magic = 5_2912._2 ;  // fail
		// var magic =  2_234.0_0 ;	// pass
		// var magic =  9___6 ;		// pass
		// var magic =  _1_3_5_0;	// fail
		System.out.println(magic);
	}


	
	
///////// main()
	public static void main(String[] args) {
		System.out.println();
	
		ExamTest examTest = new ExamTest();
		// examTest.C01_08(); 
		// examTest.C01_09(); 
		// examTest.C01_10(); 
		examTest.C01_12(3); 
	 
		System.out.println();
		System.out.println("Hell from ExamTest #C01");
	}
}
