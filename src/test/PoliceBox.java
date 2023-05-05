package test;
// import packagea.ClassA;


///////// #62 #01_20 Review Questions
public class PoliceBox {
	
	String color;
	long age;
	
	
	public PoliceBox() {
		System.out.println("PoliceBox constructor called");
	}
		
	
	// method not consturctor
	public void PoliceBox() {
		color = "Blue";
		age = 1200;
	}
	

	
///////// main()
	public static void main(String[] args) {
		
		
		// not using var - traditional method
		PoliceBox policeBox = new PoliceBox();
		
		// javac -d classes -cp classes src/test/PoliceBox.java
		// javac -d classes  src/test/PoliceBox.java

		// java -cp classes test.PoliceBox  
		// java -cp classes test/PoliceBox
		var p = new PoliceBox();
		var q = new PoliceBox();
		p.color = "green";
		p.age = 1400 ;
		p = q; 
		
		System.out.println("Q1=" + q.color);
		System.out.println("Q2=" + q.age);
		System.out.println("P1=" + p.color);
		System.out.println("P2=" + p.age);
	}
}
