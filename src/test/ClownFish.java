package test;
// import packagea.ClassA;


///////// #C01_12
public class ClownFish {
	
	// int gills = 0, double weight =2; // fails
	int gills = 0;  double weight =2;
	
	{ int fins = gills;}

	// void print(int length = 3) {		// fails
	void print(int length) {
		System.out.println(gills);
		System.out.println(weight);
		// System.out.println(fins);	// fails   11:{ int fins ...} out of scope
		System.out.println(length);
	 }
		
	
///////// main()
	public static void main(String[] args) {
		System.out.println();
	
		ClownFish clownFish = new ClownFish();
		clownFish.print(3); 
	 
		System.out.println();
		System.out.println("Hell from ClownFish #C01_12");
	}
}
