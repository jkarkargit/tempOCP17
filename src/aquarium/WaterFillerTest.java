package aquarium;


// A. ////////////////////////  pass
 import aquarium.*;

// B. ////////////////////////  pass
// import aquarium.Water;
// import aquarium.jellies.*;

// C. ////////////////////////  pass
// import  aquarium.*;
// import  aquarium.jellies.Water;

// D. ////////////////////////  
// import aquarium.*;
// import aquarium.jellies.*;



// E. //////////////////////// fail
// both class aquarium.Water in aquarium and class 
// aquarium.jellies.Water in aquarium.jellies match

// import aquarium.Water;
// import aquarium.jellies.Water;


 public class  WaterFillerTest  {
	 
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
		 
		 // java -cp classes employee/WaterFiller
		 // java -cp classes employee.WaterFiller
	//////////////////////////////////////////////////////////////	
		
		Water water = new Water();
		
		System.out.println("calling water.salty: " + water.salty);
		System.out.println("calling water.getSalty(): " + water.getSalty());
		
		
	}
		
	
	
 }