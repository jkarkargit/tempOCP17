package aquarium;

// javac -d classes src/aquarium/Water.java
 public class Water {
	boolean salty = false;
	
	public boolean getSalty() {
		System.out.println("aquarium::Water.getsalty()");
		return salty;
	}
		
 }
