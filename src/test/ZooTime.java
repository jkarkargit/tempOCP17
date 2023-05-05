package test;
// import packagea.ClassA;


public class ZooTime {


///////// #41
	public void whatTypeAmI() {
		var name = "Hello";
		var size = 7;
		Object os = name;
		Object oi = size;
		
		System.out.println(os.getClass());
		System.out.println(oi.getClass());
		
		System.out.println( ( (Object)name.getClass().getSimpleName() ));		
		
		System.out.println( ( ((Object)size).getClass().getSimpleName() ));
		//if (size instanceof
		//System.out.println(size instanceof int);
	}
/////////  

	
	
///////// main()
	public static void main(String[] args) {
		Integer zooTime = Integer.valueOf(9);
		System.out.println(zooTime.getClass());
		
		Number num = zooTime ;
		System.out.println(num.getClass());
		
		System.out.println(num.getClass());
		Object obj = zooTime;
		
		System.out.println();
	

		System.out.println(zooTime.getClass());
		System.out.println(num.getClass());
		System.out.println(obj.getClass());
		
		System.out.println( ( (Object)zooTime.getClass().getSimpleName() ));		
		System.out.println( ( ((Object)num).getClass().getSimpleName() ));
		System.out.println( ( ((Object)obj).getClass().getSimpleName() ));
		
		// Zoo zoo = new Zoo();
		// zoo.whatTypeAmI();
	System.out.println("Hell from Zoo #41");
	}
}
