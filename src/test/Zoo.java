package test;
// import packagea.ClassA;


public class Zoo {


///////// #41
	public void whatTypeAmI() {
		var name = "Hello";
		var size = 7;
		Object os = name;
		Object oi = size;
		
		System.out.println(os.getClass());
		System.out.println(oi.getClass());
		
		//////
		
		System.out.println( ( (Object)name.getClass().getSimpleName() ));		
		
		System.out.println( ( ((Object)size).getClass().getSimpleName() ));
		//if (size instanceof
		//System.out.println(size instanceof int);
	}
/////////  

	
	
///////// main()
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.whatTypeAmI();
	System.out.println("Hell from Zoo #41");
	}
}
