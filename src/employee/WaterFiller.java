package employee;


// A. ////////////////////////  pass
// Water belongs to aquarium

import aquarium.*;



// B. ////////////////////////  pass
// Water belongs to aquarium

// import aquarium.Water; <----- takes precedence
// import aquarium.jellies.*;



// C. ////////////////////////  pass
// Water belongs to jellies

 // import  aquarium.*;
 // import  aquarium.jellies.Water; <----- takes precedence



// D. ////////////////////////  fail  - does not compile
// ambiguity - Water belongs to aquarium or jellies?
//			   java cannot decide wich water to use.
// import aquarium.*; <----- ambiguity
// import aquarium.jellies.*; <----- ambiguity



// E. //////////////////////// fail - does not compile
// ambiguity - java cannot decide which Water to use
// both class aquarium.Water in aquarium and class 
// aquarium.jellies.Water in aquarium.jellies match

// import aquarium.Water; <----- tie
// import aquarium.jellies.Water; <----- tie
//////////////////////////////////////



///////// WaterFiller class
 public class  WaterFiller  {
	 
	 // javac -d classes src/aquarium/Water.java
	 // javac -d classes src/aquarium/jellies/Water.java
	 // javac -d classes -cp classes src/employee/WaterFiller.java
	 
	 //java -cp classes employee/WaterFiller
	 
	 
	Water water;
	
	
	
	
	
	
	
///////// main()
	public static void main(String[] args) {	
		//////////////////////////////////////////////////////////////	
		 // javac -d classes src/aquarium/Water.java
		 // javac -d classes src/aquarium/jellies/Water.java
		 // javac -d classes -cp classes src/employee/WaterFiller.java
		 
		 //java -cp classes employee/WaterFiller
	//////////////////////////////////////////////////////////////	
		
		Water water = new Water();
		
		// System.out.println("calling water.salty: " + water.salty);
		System.out.println("calling water.getSalty(): " + water.getSalty());
	}
	
 }